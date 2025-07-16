package br.com.bancadejornalweb.controllerpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class RealizarVendaWebController {

    @GetMapping("/realizarvenda")
    public String realizarvenda() {
        return "realizarvenda";
    }
}
