package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Persona;

import java.util.Iterator;
import java.util.Optional;

public interface PersonaDao extends GenericoDao<Persona>{
    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);

    Optional<Persona> buscarPorDui(String dui);
    Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
