package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OfrecenProductoPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "establecimiento_id", referencedColumnName = "id")
    private Servicio servicios_id;

    @ManyToOne
    @JoinColumn(name = "productos_id", referencedColumnName = "id")
    private Producto productos_id;

    public OfrecenProductoPK(Servicio servicios_id, Producto productos_id) {
        super();
        this.servicios_id = servicios_id;
        this.productos_id = productos_id;
    }

    public Servicio getId_Establecimiento() {
        return servicios_id;
    }

    public Producto getId_Producto() {
        return productos_id;
    }

    public void setId_Establecimiento(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public void setId_Producto(Producto productos_id) {
        this.productos_id = productos_id;
    }

}
