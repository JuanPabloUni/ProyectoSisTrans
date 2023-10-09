package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentaconsumos")
public class CuentaConsumo {

    @EmbeddedId
    private CuentaConsumoPK pk;

    public CuentaConsumo()
    {;}

    public CuentaConsumo(Reserva reservas_id, Servicio servicios_id) {
        this.pk = new CuentaConsumoPK(reservas_id, servicios_id);
    }

    public CuentaConsumoPK getPk() {
        return pk;
    }

    public void setPk(CuentaConsumoPK pk) {
        this.pk = pk;
    }

}
