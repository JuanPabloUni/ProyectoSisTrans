package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer numero;

    private Integer piso;

    @ManyToOne
    @JoinColumn(name =  "reservas_id", referencedColumnName = "id")
    private Reserva reservas_id;

    @ManyToOne
    @JoinColumn(name =  "tiposhabitacion_id", referencedColumnName = "id")
    private TipoHabitacion tiposhabitacion_id;

    public Habitacion(){;}

    public Habitacion(Integer numero, Integer piso, Reserva reservas_id, TipoHabitacion tiposhabitacion_id) {
        this.numero = numero;
        this.piso = piso;
        this.reservas_id = reservas_id;
        this.tiposhabitacion_id = tiposhabitacion_id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public Reserva getReservas_id() {
        return reservas_id;
    }

    public TipoHabitacion getTiposhabitacion_id() {
        return tiposhabitacion_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public void setReservas_id(Reserva reservas_id) {
        this.reservas_id = reservas_id;
    }

    public void setTiposhabitacion_id(TipoHabitacion tiposhabitacion_id) {
        this.tiposhabitacion_id = tiposhabitacion_id;
    }
    
}
