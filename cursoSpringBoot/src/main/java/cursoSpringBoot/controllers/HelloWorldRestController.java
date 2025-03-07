package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Esta etiqueta indica que la clase manejara solicitudes web de tipo get
@RestController

public class HelloWorldRestController {

    //Con esta etiqueta se podra acceder a este metodo desde la web con un url
    //Esto es un end ponit o punto de acceso de una apicacion web
    //EL nombre del sufijo o del ruta va entre parentesis
    //Se pude tener mas de un tipo de sufijo
    @GetMapping({"/hello","/mundo","/nuevo"})
    public String holaMundo(){
        String variable;
        variable  = "Hola Mundo";
        return variable;
    }
    @GetMapping("numero")
    public int numero(){
        int numero;
        numero = 45+10;
        return numero;
    }

}
