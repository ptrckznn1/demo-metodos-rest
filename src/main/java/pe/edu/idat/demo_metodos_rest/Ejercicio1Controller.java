package pe.edu.idat.demo_metodos_rest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio1Controller {
    private final Ejercicio1Service ejercicio1Service;

    public Ejercicio1Controller(Ejercicio1Service ejercicio1Service){
        this.ejercicio1Service=ejercicio1Service;
    }
}
