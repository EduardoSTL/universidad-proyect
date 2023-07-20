package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Profesor;

public interface ProfesorDao extends PersonaDao{

    Iterable<Profesor> findProfesoresByCarrera(String carrera);
}
