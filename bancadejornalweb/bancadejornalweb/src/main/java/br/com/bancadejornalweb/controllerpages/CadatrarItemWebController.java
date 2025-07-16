package br.com.bancadejornalweb.controllerpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class CadatrarItemWebController {

    @GetMapping("/cadastraritem")
    public String cadastrarItem() {
        return "cadastraritem";
    }
}
