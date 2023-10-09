package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="ofrecenproductos")
public class OfrecenProducto {

    @EmbeddedId
    private OfrecenProductoPK pk;

    public OfrecenProducto()
    {;}

    public OfrecenProducto(Establecimiento establecimiento_id, Producto productos_id) {
        this.pk = new OfrecenProductoPK(establecimiento_id, productos_id);
    }

    public OfrecenProductoPK getPk() {
        return pk;
    }

    public void setPk(OfrecenProductoPK pk) {
        this.pk = pk;
    }

}
