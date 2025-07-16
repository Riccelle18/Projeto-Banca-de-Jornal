package bancadejornalpi.servlet;

import bancadejornalpi.dao.EstoqueDAO;
import bancadejornalpi.model.Estoque;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cadastrarEstoque")
public class CadastroEstoqueServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            Estoque e = new Estoque(
                request.getParameter("produto"),
                Integer.parseInt(request.getParameter("quantidade")),
                Double.parseDouble(request.getParameter("preco"))
            );
            new EstoqueDAO().inserir(e);
            request.setAttribute("mensagem", "Produto cadastrado com sucesso!");
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("erro", e.getMessage());
            request.getRequestDispatcher("estoque.jsp").forward(request, response);
        }
    }
}
