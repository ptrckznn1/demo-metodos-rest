package pe.edu.idat.demo_metodos_rest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio2Controller {

    private final Ejercicio2Service ejercicio2Service;
    public Ejercicio2Controller(Ejercicio2Service ejercicio2Service){
        this.ejercicio2Service=ejercicio2Service;

    }

}
