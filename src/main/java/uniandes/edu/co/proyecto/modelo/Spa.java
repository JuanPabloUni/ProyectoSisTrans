package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="spas")
public class Spa {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private Integer duracion;

    private Float costo;

    public Spa(){;}

    public Spa(Servicio servicios_id, Integer duracion, Float costo) {
        this.servicios_id = servicios_id;
        this.duracion = duracion;
        this.costo = costo;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracionSpa) {
        this.duracion = duracionSpa;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costoSpa) {
        this.costo = costoSpa;
    }

}