package DAO;

import java.util.List;

import Models.Conta;
import Models.Transacao;

public class ContaDAO {
    // Métodos para operações no banco de dados
    public Conta getContaById(int id) { /* Implementação */ }
    public void depositar(int id, double valor) { /* Implementação */ }
    public double getSaldo(int id) { /* Implementação */ }
    // Outros métodos necessários

    public void transferir(int contaOrigemId, int contaDestinoId, double valor) {
        // Implementação da transferência no banco de dados
    }

    public List<Transacao> getExtrato(int idConta) {
        // Implementação para obter o extrato do banco de dados
    }
}
