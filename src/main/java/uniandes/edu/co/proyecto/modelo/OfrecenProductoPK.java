package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OfrecenProductoPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "establecimiento_id", referencedColumnName = "servicios_id")
    private Establecimiento establecimiento_id;

    @ManyToOne
    @JoinColumn(name = "productos_id", referencedColumnName = "id")
    private Producto productos_id;

    public OfrecenProductoPK(Establecimiento establecimiento_id, Producto productos_id) {
        super();
        this.establecimiento_id = establecimiento_id;
        this.productos_id = productos_id;
    }

    public Establecimiento getId_Establecimiento() {
        return establecimiento_id;
    }

    public Producto getId_Producto() {
        return productos_id;
    }

    public void setId_Establecimiento(Establecimiento establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public void setId_Producto(Producto productos_id) {
        this.productos_id = productos_id;
    }

}
