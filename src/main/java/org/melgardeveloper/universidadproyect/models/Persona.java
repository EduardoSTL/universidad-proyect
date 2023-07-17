package org.melgardeveloper.universidadproyect.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 68)
    private String nombre;
    @Column(nullable = false, length = 68)
    private String apellido;
    @Column(nullable = false, unique = true, length = 10)
    private String dui;
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @Column(name = "fecha_modificacion")
    private LocalDate fechaModificacion;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal")),
            @AttributeOverride(name = "dpto", column = @Column(name = "departamento"))
    })
    private Direccion direccion;


    //Constructores
    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String dui, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.direccion = direccion;
    }

    //Getter y Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @PrePersist
    private void antesdePersistir(){
        this.fechaAlta = LocalDate.now();
    }
    @PreUpdate
    private void despuesdeUpdate(){
        this.fechaModificacion = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dui='" + dui + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                ", direccion=" + direccion +
                '}';
    }

    //Comparar tipo de Persona
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) && Objects.equals(dui, persona.dui);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dui);
    }
}
