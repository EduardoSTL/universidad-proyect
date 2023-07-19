package org.melgardeveloper.universidadproyect.repositories;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.springframework.stereotype.Repository;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository {

    Iterable<Persona>findProfesorByCarrera(String carrera);

}
