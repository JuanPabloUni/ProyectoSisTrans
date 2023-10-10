package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="internet")
public class Internet {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private Integer capacidad;

    private Float costoXDia;

    public Internet(){;}

    public Internet(Servicio servicios_id, Integer capacidad, Float costoXDia) {
        this.servicios_id = servicios_id;
        this.capacidad = capacidad;
        this.costoXDia = costoXDia;
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

    public Float getCostoXDia() {
        return costoXDia;
    }

    public void setCostoXDia(Float costoXDia) {
        this.costoXDia = costoXDia;
    }

}