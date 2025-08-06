package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define uma classe como controlador REST (retorno dos métodos vira JSON/XML).
@RequestMapping //Mapeia um endpoint (URL) para uma classe ou método (ex: @RequestMapping("/api")).
public class Controller {

    @GetMapping("/boasvindas")
        public String boasVindas(){
            return "Essa a é minha primeira mensagem nessa rota";
    }
}

//parei no minuto 46:00