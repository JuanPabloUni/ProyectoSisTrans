package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservasservicios")
public class ReservaServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date fecha;

    private Time horaInicio;

    private Time horaFin;

    @ManyToOne
    @JoinColumn(name =  "reservas_id", referencedColumnName = "id")
    private Reserva reservas_id;

    @ManyToOne
    @JoinColumn(name =  "servicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    public ReservaServicio(){;}

    public ReservaServicio(Date fecha, Time horaInicio, Time horaFin, Reserva reservas_id, Servicio servicios_id) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.reservas_id = reservas_id;
        this.servicios_id = servicios_id;
    }

    public Integer getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHoraInicio(){
        return horaInicio;
    }

    public Time getHoraFin(){
        return horaFin;
    }

    public Reserva getReservas_id() {
        return reservas_id;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public void setReservas_id(Reserva reservas_id) {
        this.reservas_id = reservas_id;
    }

    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

}
