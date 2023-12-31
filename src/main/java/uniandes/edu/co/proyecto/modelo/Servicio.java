package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

    private String tipoServicio;

    public Servicio(){;}

    public Servicio(String nombre, String descripcion, String tipoServicio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreServicio) {
        this.nombre = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcionServicio) {
        this.descripcion = descripcionServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio= tipoServicio;
    }

    @Override
    public String toString() {
        return this.nombre+"|"+this.descripcion+"|"+this.tipoServicio;
    }
    
}
