package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tiposhabitacion")
public class TipoHabitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String tipo;

    private Integer capacidad;
    
    private Integer camas;

    private Float costoXNoche;

    public TipoHabitacion(){;}

    public TipoHabitacion(String tipo, Integer capacidad, Integer camas, Float costoXNoche) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.camas = camas;
        this.costoXNoche = costoXNoche;
    }

    public Integer getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getCamas() {
        return camas;
    }

    public Float getCostoXNoche() {
        return costoXNoche;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public void setCostoXNoche(Float costoXNoche) {
        this.costoXNoche = costoXNoche;
    }

}
