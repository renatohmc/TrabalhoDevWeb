package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransferenciaServlet")
public class TransferenciaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int contaOrigemId = Integer.parseInt(request.getParameter("contaOrigem"));
        int contaDestinoId = Integer.parseInt(request.getParameter("contaDestino"));
        double valor = Double.parseDouble(request.getParameter("valor"));

        ContaDAO contaDAO = new ContaDAO();
        contaDAO.transferir(contaOrigemId, contaDestinoId, valor);

        // Lógica para redirecionar ou gerar resposta adequada
    }
}