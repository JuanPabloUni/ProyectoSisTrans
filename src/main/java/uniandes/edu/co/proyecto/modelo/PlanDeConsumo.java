package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="planesdeconsumo")
public class PlanDeConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

    private Float descuento;

    public PlanDeConsumo(){;}

    public PlanDeConsumo(String nombre, String descripcion, Float descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
