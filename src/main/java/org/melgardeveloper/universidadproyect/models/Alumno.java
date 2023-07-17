package org.melgardeveloper.universidadproyect.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona{

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;

    //Constr. de Persona vacio:
    public Alumno() {
    }

    //Constr. de Persona completo:
    public Alumno(Integer id, String nombre, String apellido, String dui, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion) {
        super(id, nombre, apellido, dui, fechaAlta, fechaModificacion, direccion);
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Alumno{}" ;
    }
}