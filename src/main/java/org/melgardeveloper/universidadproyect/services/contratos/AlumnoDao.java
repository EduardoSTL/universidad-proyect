package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Alumno;
import org.melgardeveloper.universidadproyect.models.Aula;
import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.models.enums.Pizarron;

import java.util.Optional;

public interface AlumnoDao extends PersonaDao{

    Iterable<Aula> findAulaByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulaByPabellonNombre(String nombre);
    Optional<Aula> findAulaByNroAula(Integer nroAula);
}
