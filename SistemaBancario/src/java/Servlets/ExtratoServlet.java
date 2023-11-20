package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExtratoServlet")
public class ExtratoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idConta = Integer.parseInt(request.getParameter("contaId"));

        ContaDAO contaDAO = new ContaDAO();
        List<Transacao> extrato = contaDAO.getExtrato(idConta);

        // Lógica para enviar o extrato para a página JSP ou outro método de resposta
    }
}