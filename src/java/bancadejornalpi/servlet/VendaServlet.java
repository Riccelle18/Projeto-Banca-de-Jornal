package bancadejornalpi.servlet;

import bancadejornalpi.dao.VendaDAO;
import bancadejornalpi.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/realizarVenda")
public class VendaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            double preco = Double.parseDouble(request.getParameter("preco"));
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            double total = preco * quantidade;
            
            Funcionario f = new Funcionario("João", "Vendedor", 2500);
            Cliente c = new Cliente("Maria", "Rua A", "12345678");
            Venda v = new Venda(new Date(), total, f, c);
            new VendaDAO().inserir(v);

            request.setAttribute("mensagem", "Venda realizada com sucesso! Total: R$ " + total);
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("erro", e.getMessage());
            request.getRequestDispatcher("venda.jsp").forward(request, response);
        }
    }
}