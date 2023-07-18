package org.melgardeveloper.universidadproyect.services.contratos;

import java.util.Optional;

public interface GenericoDao<E> {  //Creamos multiherencia

    Optional<E> findById(Integer id);
    E save(E entidad);
    Iterable<E> findAll();
    void deleteById(Integer id);
}
