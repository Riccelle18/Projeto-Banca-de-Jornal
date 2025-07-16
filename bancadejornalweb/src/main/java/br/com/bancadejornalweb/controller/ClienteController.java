package br.com.bancadejornalweb.controller;


import br.com.bancadejornalweb.dba.ClienteDAO;
import br.com.bancadejornalweb.models.Cliente;
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

@Controller()
public class ClienteController {

    @PostMapping("/create/cliente")
    public String createCliente(@RequestParam String nome,
                              @RequestParam String endereco,
                              @RequestParam String telefone,
                              Model model)
         {
        try {
            new ClienteDAO().inserir(new Cliente(nome, endereco, telefone));
            model.addAttribute("mensagem", "Cliente cadastrado com sucesso!");
            return "sucesso";
        } catch (Exception e) {
            model.addAttribute("erro", e.getMessage());
            return "cadatrarcliente";
        }
    }
}