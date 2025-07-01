package bancadejornalpi.servlet;

import bancadejornalpi.dao.ClienteDAO;
import bancadejornalpi.model.Cliente;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cadastrarCliente")
public class CadastroClienteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            Cliente c = new Cliente(
                request.getParameter("nome"),
                request.getParameter("endereco"),
                request.getParameter("telefone")
            );
            new ClienteDAO().inserir(c);
            request.setAttribute("mensagem", "Cliente cadastrado com sucesso!");
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("erro", e.getMessage());
            request.getRequestDispatcher("clientes.jsp").forward(request, response);
        }
    }
}