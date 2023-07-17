package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Carrera;

import java.util.Optional;

public interface CarreraDao {

    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    void deleteById(Integer id);
}
