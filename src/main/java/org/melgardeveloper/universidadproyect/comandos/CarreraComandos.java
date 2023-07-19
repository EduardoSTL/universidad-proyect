package org.melgardeveloper.universidadproyect.comandos;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDao servicio;

    @Override
    public void run(String... args) throws Exception {

        //Agregar Carreras
        /*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5);
        Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial", 55, 5);
        Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53, 5);
        Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45, 5);
        Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4);
        Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4);
        Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 3);
        Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos - RRHH", 33, 3);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licSistemas);
        servicio.save(licTurismo);
        servicio.save(licYoga);
        servicio.save(licRecursos);*/

        //Buscar carrera por nombre si contiene:
        /*System.out.println("====Buscar carrera por nombre si contiene====");
        List<Carrera> carreras = (List<Carrera>)servicio.findCarreraByNombreContains("Ingenieria");
        carreras.forEach(System.out::println);*/

        //Encontrar carrera ignorando Mayus/Minus:
        /*List<Carrera> carrerasIgnoreCase1 = (List<Carrera>)servicio.findCarreraByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>)servicio.findCarreraByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);*/

        //Encontrar carrera por cant de años
        /*List<Carrera> carreraPorAnio = (List<Carrera>)servicio.findCarreraByCantidadAniosAfter(4);
        carreraPorAnio.forEach(System.out::println);*/

        //Agregar primera Carrera
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

        //Buscar carrera por ID
        /*Carrera carrera = null;
        Optional<Carrera> oCarrera = servicio.findById(2);
        if (oCarrera.isPresent()){
            carrera = oCarrera.get();
            System.out.println(carrera.toString());
        } else {
            System.out.println("Carrera no existe en la DB");
        }*/

        //Crud carrera
        /*carrera.setCantidadMaterias(65);
        carrera.setCantidadAnios(6);
        servicio.save(carrera);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());
        servicio.deleteById(1);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());*/
    }
}