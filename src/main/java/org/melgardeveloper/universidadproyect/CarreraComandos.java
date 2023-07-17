package org.melgardeveloper.universidadproyect;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDao servicio;

    @Override
    public void run(String... args) throws Exception {
        Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 50, 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());
    }
}
