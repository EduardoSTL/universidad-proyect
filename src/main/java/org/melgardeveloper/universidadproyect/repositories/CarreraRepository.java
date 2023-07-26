package org.melgardeveloper.universidadproyect.repositories;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

    //@Query("select c from Carrera c where c.nombre like %?1%")
    Iterable<Carrera> findCarreraByNombreContains(String nombre);

    //@Query("select c from Carrera c where upper(c.nombre) like upper(%?1%)")
    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);

    //@Query("select c from Carrera c where c.cantidadAnios > ?1")
    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);


    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
