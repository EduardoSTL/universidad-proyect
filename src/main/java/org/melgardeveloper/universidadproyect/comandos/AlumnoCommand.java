package org.melgardeveloper.universidadproyect.comandos;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.melgardeveloper.universidadproyect.services.contratos.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class AlumnoCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDaoImpl")
    private PersonaDao personaDao;

    @Autowired
    private CarreraDao carreraDao;

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("----------------- ALumnos Command -----------------");
        System.out.println("----------------- Busqueda de Personas por Apellido -----------------");
        Iterable<Persona> iPersona = personaDao.buscarPersonaPorApellido(ObjetosDummy.getAlumnoDos().getApellido());
        iPersona.forEach(System.out::println);

        System.out.println("----------------- Busqueda de Personas por DUI -----------------");
        Optional<Persona> oPersona = personaDao.buscarPorDui(ObjetosDummy.getEmpleadoUno().getDui());
        if (oPersona.isPresent()){
            System.out.println(oPersona.get().toString());
        }
        System.out.println("--------- Busqueda de Personas por Nombre y Apellido ---------");
        Optional<Persona> oPersonaDos = personaDao.buscarPorNombreYApellido(ObjetosDummy.getProfesorDos().getNombre(),
                ObjetosDummy.getProfesorDos().getApellido());
        if (oPersona.isPresent()){
            System.out.println(oPersonaDos.get().toString());
        }
        System.out.println("--------- Busqueda de Alumnos por Carrera ---------");
        Iterable<Persona> iAlumnos= ((AlumnoDao)personaDao).buscarAlumnosPorNombreCarrera
                (ObjetosDummy.getCarreraIngSis().getNombre());
        iAlumnos.forEach(System.out::println);*/
    }
}
