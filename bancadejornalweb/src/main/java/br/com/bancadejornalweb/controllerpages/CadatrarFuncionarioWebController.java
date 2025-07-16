package br.com.bancadejornalweb.controllerpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class CadatrarFuncionarioWebController {

    @GetMapping("/cadastrarfuncionario")
    public String cadastrarFuncionario() {
        return "cadastrarfuncionario";
    }
}
