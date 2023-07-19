package org.melgardeveloper.universidadproyect.services.contratos;

import org.melgardeveloper.universidadproyect.models.Carrera;

public interface CarreraDao extends GenericoDao<Carrera>{

    Iterable<Carrera> findCarreraByNombreContains(String nombre);
    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);
}
