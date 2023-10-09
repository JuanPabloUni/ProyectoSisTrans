package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="gimnasios")
public class Gimnasio {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private Integer capacidad;
    
    private Integer numMaquinas;

    private String horarioServicio;

    public Gimnasio(){;}

    public Gimnasio(Servicio servicios_id, Integer capacidad, Integer numMaquinas, String horarioServicio) {
        this.servicios_id = servicios_id;
        this.capacidad = capacidad;
        this.numMaquinas = numMaquinas;
        this.horarioServicio = horarioServicio;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidadGimnasio) {
        this.capacidad = capacidadGimnasio;
    }

    public Integer getNumMaquinas() {
        return numMaquinas;
    }

    public void setNumMaquinas(Integer numMaquinas) {
        this.numMaquinas = numMaquinas;
    }

    public String getHorarioServicio() {
        return horarioServicio;
    }

    public void setHorarioServicio(String horarioServicio) {
        this.horarioServicio = horarioServicio;
    }

}
