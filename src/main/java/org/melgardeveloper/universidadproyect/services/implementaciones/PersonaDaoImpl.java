package org.melgardeveloper.universidadproyect.services.implementaciones;

import org.melgardeveloper.universidadproyect.models.Persona;
import org.melgardeveloper.universidadproyect.repositories.PersonaRepository;
import org.melgardeveloper.universidadproyect.services.contratos.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonaDaoImpl extends GenericoDaoImpl<Persona, PersonaRepository> implements PersonaDao {

    @Autowired
    public PersonaDaoImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return repository.buscarPorNombreYApellido(nombre, apellido);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorDui(String dui) {
        return repository.buscarPorDui(dui);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        return repository.buscarPersonaPorApellido(apellido);
    }
}
