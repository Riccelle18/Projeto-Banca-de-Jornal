package br.com.bancadejornalweb.controllerpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class CadatrarClienteWebController {

    @GetMapping("/cadastrarcliente")
    public String cadastrarCliente() {
        return "cadastrarcliente";
    }
}
