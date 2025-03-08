package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class palindromo {
    @GetMapping("/validar/{palabra}")
    public String palindromo(@PathVariable String palabra){
        if(validador(palabra)){
            return "Es palindromo";
        }else{
            return "No es palindromo";
        }

    }

    public boolean validador(String palabra){
        int length = palabra.length();
        for (int i = 0; i < length/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(length-i-1) ) {
                return false;
            }
        }
        return true;
    }
}
