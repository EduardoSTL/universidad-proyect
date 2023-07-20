package org.melgardeveloper.universidadproyect.repositories;

import org.melgardeveloper.universidadproyect.models.Profesor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioProfesores")
@Primary
public interface ProfesorRepository extends PersonaRepository {

    @Query("SELECT p FROM Profesor p JOIN p.carreras c WHERE c.nombre = ?1")
    Iterable<Profesor> findProfesoresByCarrera(String carrera);
}
