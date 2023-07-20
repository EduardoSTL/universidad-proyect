package org.melgardeveloper.universidadproyect.services.implementaciones;

import org.melgardeveloper.universidadproyect.models.Profesor;
import org.melgardeveloper.universidadproyect.repositories.PersonaRepository;
import org.melgardeveloper.universidadproyect.repositories.ProfesorRepository;
import org.melgardeveloper.universidadproyect.services.contratos.ProfesorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProfesorDaoImpl extends PersonaDaoImpl implements ProfesorDao {

    @Autowired
    public ProfesorDaoImpl(@Qualifier("repositorioProfesores") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Profesor> findProfesoresByCarrera(String carrera) {
        return ((ProfesorRepository)repository).findProfesoresByCarrera(carrera);
    }
}
