package br.com.bancadejornalweb.controller;

import br.com.bancadejornalweb.dba.FuncionarioDAO;
import br.com.bancadejornalweb.models.Funcionario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Controller
public class FuncionarioController {


    private FuncionarioDAO funcionarioDAO;

    public FuncionarioController() {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    @PostMapping("/create/funcionario")
    public String cadastrarFuncionario(
            @RequestParam String nome,
            @RequestParam String cargo,
            @RequestParam double salario,
            Model model
    ) throws SQLException {
        if (nome == null || nome.isBlank() || salario <= 0 || cargo == null || cargo.isBlank()) {
            model.addAttribute("erro", "Todos os campos devem ser preenchidos corretamente.");
            return "cadastrarfuncionario"; // nome do JSP sem extensão
        }

        funcionarioDAO.inserir(new Funcionario(nome, cargo, salario));
        model.addAttribute("mensagem", "Funcionário cadastrado com sucesso!");
        return "sucesso"; // outra página JSP de sucesso
    }
}
