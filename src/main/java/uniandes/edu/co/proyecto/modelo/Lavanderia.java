package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="lavanderias")
public class Lavanderia {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private String tipoPrenda;

    private Float costoXPrenda;

    public Lavanderia(){;}

    public Lavanderia(Servicio servicios_id, String tipoPrenda, Float costoXPrenda) {
        this.servicios_id = servicios_id;
        this.tipoPrenda = tipoPrenda;
        this.costoXPrenda = costoXPrenda;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public Float getCostoXPrenda() {
        return costoXPrenda;
    }

    public void setCostoXPrenda(Float costoXPrenda) {
        this.costoXPrenda = costoXPrenda;
    }

}