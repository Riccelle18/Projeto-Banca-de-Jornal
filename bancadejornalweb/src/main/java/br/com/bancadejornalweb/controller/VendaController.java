package br.com.bancadejornalweb.controller;


import br.com.bancadejornalweb.dba.VendaDAO;
import br.com.bancadejornalweb.models.Cliente;
import br.com.bancadejornalweb.models.Funcionario;
import br.com.bancadejornalweb.models.Venda;

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
import java.util.Date;

@Controller
public class VendaController{

    @PostMapping("/create/venda")
    public String criarVenda(
                             @RequestParam float preco,
                             @RequestParam Integer quantidade,
                             Model model)
        {
        try {

            double total = preco * quantidade;
            
            Funcionario f = new Funcionario("João", "Vendedor", 2500);
            Cliente c = new Cliente("Maria", "Rua A", "12345678");
            Venda v = new Venda(new Date(), total, f, c);
            new VendaDAO().inserir(v);

            model.addAttribute("mensagem", "Venda realizada com sucesso! Total: R$ " + total);
           return "sucesso";
        } catch (Exception e) {
            model.addAttribute("erro", e.getMessage());
            return  "realizarvenda";
        }
    }
}