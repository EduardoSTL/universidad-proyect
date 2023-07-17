package org.melgardeveloper.universidadproyect.repositories;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
