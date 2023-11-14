package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Con @RestController indicamos que es un controlador REST
@RestController
public class HelloWorldControllers {

    // Con @GetMapping indicamos que es un método que responde a una petición GET
    // ("/HelloWorld") es la ruta.
    // @RequestParam Y @PathVariable indican que el parámetro nombre es opcional y si no se pasa, el valor predeterminado es "UNKNOWN"
    @GetMapping("/HelloWorld")
    String saluda(@RequestParam(defaultValue = "UNKNOWN") String nombre) {

        return "Hola " + nombre + ". Estás ejecutando un proyecto Maven";
    }
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "UNKNOWN";
        }
        return "Hola " + nombre + ". Estás ejecutando un proyecto Maven";
    }
}
