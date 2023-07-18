package org.melgardeveloper.universidadproyect.repositories;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    @Query("select p from Persona p where p.nombre = ?1 and p.apellido = ?2")
    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    @Query("select p from Persona p where p.dui = ?1")
    Optional<Persona> buscarPorDui(String dui);
    @Query("select p from Persona p where p.apellido like %?1%")
    Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
