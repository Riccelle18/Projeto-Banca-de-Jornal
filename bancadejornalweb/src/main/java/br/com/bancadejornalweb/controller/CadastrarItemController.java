package br.com.bancadejornalweb.controller;


import br.com.bancadejornalweb.dba.EstoqueDAO;
import br.com.bancadejornalweb.models.Estoque;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class CadastrarItemController {


    @PostMapping("/create/item")
    public String cadastrarItem(@RequestParam String produto,
                                @RequestParam Integer quantidade,
                                @RequestParam Float preco,
                                Model model)
        throws ServletException, IOException {
        try {
            new EstoqueDAO().inserir(new Estoque(produto, quantidade, preco));
            model.addAttribute("mensagem", "Produto cadastrado com sucesso!");
            return  "sucesso";
        } catch (Exception e) {
            model.addAttribute("erro", e.getMessage());
            return "cadastraritem";
        }
    }
}
