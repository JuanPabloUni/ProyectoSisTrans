package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prestamos")
public class Prestamo {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private String utensilio;

    private Float costoReemplazo;

    public Prestamo(){;}

    public Prestamo(Servicio servicios_id, String utensilio, Float costoReemplazo) {
        this.servicios_id = servicios_id;
        this.utensilio = utensilio;
        this.costoReemplazo = costoReemplazo;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public String getUtensilio() {
        return utensilio;
    }

    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }

    public Float getCostoReemplazo() {
        return costoReemplazo;
    }

    public void setCostoReemplazo(Float costoReemplazo) {
        this.costoReemplazo = costoReemplazo;
    }

}