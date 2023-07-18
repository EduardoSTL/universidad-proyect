package org.melgardeveloper.universidadproyect.services.implementaciones;


import org.melgardeveloper.universidadproyect.models.Aula;
import org.melgardeveloper.universidadproyect.models.enums.Pizarron;
import org.melgardeveloper.universidadproyect.repositories.PersonaRepository;
import org.melgardeveloper.universidadproyect.services.contratos.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoDaoImpl extends PersonaDaoImpl implements AlumnoDao {

    /*@Autowired
    @Qualifier("repositorioAlumnos")
    private PersonaRepository repository;*/
    @Autowired
    public AlumnoDaoImpl(@Qualifier ("repositorioAlumnos") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Aula> findAulaByPizarron(Pizarron pizarron) {
        return null;
    }

    @Override
    public Iterable<Aula> findAulaByPabellonNombre(String nombre) {
        return null;
    }

    @Override
    public Optional<Aula> findAulaByNroAula(Integer nroAula) {
        return Optional.empty();
    }
}
