package org.melgardeveloper.universidadproyect;

import org.melgardeveloper.universidadproyect.models.Direccion;
import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.models.Profesor;
import org.melgardeveloper.universidadproyect.services.contratos.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class UniversidadProyectApplication {

    @Autowired
    private AlumnoDao service;

    public static void main(String[] args) {
        String[] beanDefinitionsNames = SpringApplication.run(UniversidadProyectApplication.class, args)
                .getBeanDefinitionNames();
        /*for (String str : beanDefinitionsNames ){
            System.out.println(str);
        }*/
    }

    /*@Bean
    public CommandLineRunner runner(){
        return args -> {
            Direccion direccion = new Direccion("Calle Libertad", "33", "1122", "San Miguel", "", "Ciudad San Miguel");
            Persona profesor = new Profesor(1, "Alex", "Trujillo", "11001123", direccion, BigDecimal.valueOf(200));
            Persona save = service.save(profesor);
            System.out.println(save.toString());
            List<Persona> profesors = (List<Persona>) service.findAll();
            profesors.forEach(System.out::println);
        };
    }*/

    //Crear profesor
    /*@Bean
    public CommandLineRunner runner(){
        return args -> {
            Direccion direccion = new Direccion("Calle los Porceres", "22", "7777", "San Salvador", "", "San Salvador");
            Persona profesor = new Profesor(1, "Roberto", "Chavez", "33334444", direccion, BigDecimal.valueOf(500));
            Persona save = service.save(profesor);
            System.out.println(save.toString());
            List<Persona> profesors = (List<Persona>) service.findAll();
            profesors.forEach(System.out::println);
        };
    }*/

    //metodo run de CommandLineRunner
    /*@Override
    public void run(String... args) throws Exception {
        Direccion direccion = new Direccion
                ("Calle Circunvalacion", "123", "4567", "", "", "San Salvador");
        Persona alumno = new Alumno(null, "Frank", "Lopez", "0123456789", direccion);
        Persona save = service.save(alumno);
        System.out.println(save.toString());
    }*/

    //metodo runner con Bean
    /*@Bean
    public CommandLineRunner runner(){
        return args -> {
            Direccion direccion = new Direccion
                    ("Calle Militar", "333", "1113444", "", "", "Santa Ana");
            Persona alumno = new Alumno(null, "Cristian", "Gonzales", "221100877", direccion);
            Persona save = service.save(alumno);
            System.out.println(save.toString());
            List<Persona> alumnos = (List<Persona>) service.findAll();
            alumnos.forEach(System.out::println);
        };
    }
    */
}
