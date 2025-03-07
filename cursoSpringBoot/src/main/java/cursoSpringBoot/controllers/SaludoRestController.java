package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoRestController {
    //Para recibir un paremetro desde la web se necesita poner el nombre de la variable a recibir
    @GetMapping("/saludo/{nombre}")
    //Con esta etiqueta se indica que la variable vendra des de la web
    public String Saludo(@PathVariable String nombre){
        return "Hola "+ nombre;
    }
}
