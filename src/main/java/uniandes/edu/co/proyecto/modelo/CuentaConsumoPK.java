package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CuentaConsumoPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "reservas_id", referencedColumnName = "id")
    private Reserva reservas_id;

    @ManyToOne
    @JoinColumn(name = "servicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    public CuentaConsumoPK(Reserva reservas_id, Servicio servicios_id) {
        super();
        this.reservas_id = reservas_id;
        this.servicios_id = servicios_id;
    }

    public Reserva getId_Reserva() {
        return reservas_id;
    }

    public Servicio getId_Servicio() {
        return servicios_id;
    }

    public void setId_Reserva(Reserva reservas_id) {
        this.reservas_id = reservas_id;
    }

    public void setId_Servicio(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

}
