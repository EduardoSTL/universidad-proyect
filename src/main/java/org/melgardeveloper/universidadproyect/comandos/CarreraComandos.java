package org.melgardeveloper.universidadproyect.comandos;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDao servicio;

    @Override
    public void run(String... args) throws Exception {
        /*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 50, 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());*/

        /*Optional<Carrera> oCarrera = servicio.findById(1);
        if (oCarrera.isPresent()){
            Carrera carrera = oCarrera.get();
            System.out.println(carrera.toString());
        } else {
            System.out.println("Carrera no existe en la DB");
        }*/

        Carrera carrera = null;
        Optional<Carrera> oCarrera = servicio.findById(1);
        if (oCarrera.isPresent()){
            carrera = oCarrera.get();
            System.out.println(carrera.toString());
        } else {
            System.out.println("Carrera no existe en la DB");
        }
        carrera.setCantidadMaterias(65);
        carrera.setCantidadAnios(6);
        servicio.save(carrera);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());
        servicio.deleteById(1);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());
    }
}