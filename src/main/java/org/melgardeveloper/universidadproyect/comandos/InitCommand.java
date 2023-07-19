package org.melgardeveloper.universidadproyect.comandos;

import org.melgardeveloper.universidadproyect.models.Pabellon;
import org.melgardeveloper.universidadproyect.services.contratos.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "alumnoDaoImpl")
    private PersonaDao servicioAlumno;
    @Autowired
    @Qualifier(value = "empleadoDaoImpl")
    private PersonaDao servicioEmpleado;
    @Autowired
    @Qualifier(value = "profesorDaoImpl")
    private PersonaDao servicioProfesor;
    @Autowired
    private AulaDao servicioAula;
    @Autowired
    private PabellonDao servicioPabellon;
    @Autowired
    private CarreraDao servicioCarrera;

    @Override
    public void run(String... args) throws Exception {

    }
}
