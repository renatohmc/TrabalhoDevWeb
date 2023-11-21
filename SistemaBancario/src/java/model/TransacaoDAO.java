package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Transacao;

public class TransacaoDAO implements Dao<Transacao>{

    private Connection connection;

    // Construtor que recebe a conexão como parâmetro
    public TransacaoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para adicionar uma transação ao banco de dados
    public void adicionarTransacao(Transacao transacao) {
        String sql = "INSERT INTO transacoes (conta_id, tipo, valor, data) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, transacao.getContaId());
            statement.setString(2, transacao.getTipo());
            statement.setDouble(3, transacao.getValor());
            statement.setDate(4, transacao.getDate());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceções conforme necessário
        }
    }

    // Método para obter o extrato de transações de uma conta
    public List<Transacao> obterExtrato(int contaId) {
        List<Transacao> extrato = new ArrayList<>();
        String sql = "SELECT * FROM transacoes WHERE conta_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, contaId);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Transacao transacao = new Transacao();
                    transacao.setId(resultSet.getInt("id"));
                    transacao.setContaId(resultSet.getInt("conta_id"));
                    transacao.setTipo(resultSet.getString("tipo"));
                    transacao.setValor(resultSet.getDouble("valor"));
                    transacao.setDate(resultSet.getDate("data"));

                    extrato.add(transacao);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceções conforme necessário
        }

        return extrato;
    }
}

