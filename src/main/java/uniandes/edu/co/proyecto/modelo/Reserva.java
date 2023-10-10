package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date fechaInicio;

    private Date fechaFin;

    private Integer numNoches;

    private Integer numAdultos;

    private Integer numMenores;

    @ManyToOne
    @JoinColumn(name =  "usuarios_id", referencedColumnName = "id")
    private Usuario usuarios_id;

    @ManyToOne
    @JoinColumn(name =  "planesdeconsumo_id", referencedColumnName = "id")
    private PlanDeConsumo planesdeconsumo_id;
    
    public Reserva(){;}

    public Reserva(Date fechaInicio, Date fechaFin, Integer numNoches, Integer numAdultos, Integer numMenores, Usuario usuarios_id, PlanDeConsumo planesdeconsumo_id) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numNoches = numNoches;
        this.numAdultos = numAdultos;
        this.numMenores = numMenores;
        this.usuarios_id = usuarios_id;
        this.planesdeconsumo_id = planesdeconsumo_id;
    }

    public Integer getId() {
        return id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin(){
        return fechaFin;
    }

    public Integer getNumNoches() {
        return numNoches;
    }

    public Integer getNumAdultos() {
        return numAdultos;
    }

    public Integer getNumMenores() {
        return numMenores;
    }

    public Usuario getUsuarios_id() {
        return usuarios_id;
    }

    public PlanDeConsumo getPlanesdeconsumo_id() {
        return planesdeconsumo_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio= fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin= fechaFin;
    }

    public void setNumNoches(Integer numNoches) {
        this.numNoches = numNoches;
    }

    public void setNumAdultos(Integer numAdultos) {
        this.numAdultos = numAdultos;
    }

    public void setNumMenores(Integer numMenores) {
        this.numMenores = numMenores;
    }

    public void setUsuarios_id(Usuario usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public void setPlanesdeconsumo_id(PlanDeConsumo planesdeconsumo_id) {
        this.planesdeconsumo_id = planesdeconsumo_id;
    }
    
}
