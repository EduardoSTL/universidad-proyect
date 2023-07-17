package org.melgardeveloper.universidadproyect.services.implementaciones;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.repositories.CarreraRepository;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDaoImpl implements CarreraDao {

    @Autowired
    private CarreraRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Carrera> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Carrera save(Carrera carrera) {
        return repository.save(carrera);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
