package org.melgardeveloper.universidadproyect.services.implementaciones;

import org.melgardeveloper.universidadproyect.models.Carrera;
import org.melgardeveloper.universidadproyect.repositories.CarreraRepository;
import org.melgardeveloper.universidadproyect.services.contratos.CarreraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarreraDaoImpl extends GenericoDaoImpl<Carrera, CarreraRepository> implements CarreraDao {

    /*@Autowired
    private CarreraRepository repository;*/

    @Autowired
    public CarreraDaoImpl(CarreraRepository repository) {
        super(repository);
    }
}
