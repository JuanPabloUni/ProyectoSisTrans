package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="piscinas")
public class Piscina {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private Integer capacidad;

    private Float profundidad;

    private String horarioServicio;

    public Piscina(){;}

    public Piscina(Servicio servicios_id, Integer capacidad, Float profundidad, String horarioServicio) {
        this.servicios_id = servicios_id;
        this.capacidad = capacidad;
        this.profundidad = profundidad;
        this.horarioServicio = horarioServicio;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Float profundidad) {
        this.profundidad = profundidad;
    }

    public String getHorarioServicio() {
        return horarioServicio;
    }

    public void setHorarioServicio(String horarioServicio) {
        this.horarioServicio = horarioServicio;
    }
    
}