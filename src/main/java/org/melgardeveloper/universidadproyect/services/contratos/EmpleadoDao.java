package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.models.enums.TipoEmpleado;
import org.melgardeveloper.universidadproyect.repositories.PersonaRepository;

public interface EmpleadoDao extends PersonaRepository {


    Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
