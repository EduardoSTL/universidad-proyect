package org.melgardeveloper.universidadproyect.models;

import jakarta.persistence.*;
import org.melgardeveloper.universidadproyect.models.enums.TipoEmpleado;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "empleados")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Empleado extends Persona{

    private BigDecimal sueldo;
    @Column(name = "tipo_empleado")
    @Enumerated(EnumType.STRING)
    private TipoEmpleado tipoEmpleado;

    //Constr. de Persona vacio:
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "pabellon_id", foreignKey = @ForeignKey(name = "FK_PABELLON_ID"))
    private Pabellon pabellon;

    //Constr. de Persona vacio:
    public Empleado() {
    }

    //Constr. de Persona completo:
    public Empleado(Integer id, String nombre, String apellido, String dui, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion, BigDecimal sueldo, TipoEmpleado tipoEmpleado) {
        super(id, nombre, apellido, dui, fechaAlta, fechaModificacion, direccion);
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
    }

    //Getter y Setter
    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "\tEmpleado{" +
                "sueldo=" + sueldo +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }
}
