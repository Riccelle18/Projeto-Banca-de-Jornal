package bancadejornalpi.servlet;

import bancadejornalpi.dao.FuncionarioDAO;
import bancadejornalpi.model.Funcionario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cadastrarFuncionario")
public class CadastroFuncionarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            String nome = request.getParameter("nome");
            String cargo = request.getParameter("cargo");
            double salario = Double.parseDouble(request.getParameter("salario"));
            Funcionario f = new Funcionario(nome, cargo, salario);
            new FuncionarioDAO().inserir(f);
            request.setAttribute("mensagem", "Funcionário cadastrado com sucesso!");
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("erro", e.getMessage());
            request.getRequestDispatcher("funcionarios.jsp").forward(request, response);
        }
    }
}