package org.melgardeveloper.universidadproyect.comandos;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.models.Profesor;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.melgardeveloper.universidadproyect.services.contratos.PersonaDao;
import org.melgardeveloper.universidadproyect.services.contratos.ProfesorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
@Order(1)
public class ProfesorCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("profesorDaoImpl")
    private PersonaDao personaDao;

    @Autowired
    private CarreraDao carreraDao;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------- Profesores Command -----------------");
        System.out.println("--------- Busqueda de Profesores por Carrera ---------");
        Iterable<Profesor> iProfesores = ((ProfesorDao)personaDao).findProfesoresByCarrera
                (ObjetosDummy.getCarreraIngSis().getNombre());
        iProfesores.forEach(System.out::println);

        for (Profesor profesor : iProfesores) {
            Set<Carrera> carrerasAsignadas = new HashSet<>();

            for (Carrera carrera : carrerasAsignadas) {
                carrerasAsignadas.add(carrera);
            }
            profesor.setCarreras(carrerasAsignadas);
        }
    }
}
