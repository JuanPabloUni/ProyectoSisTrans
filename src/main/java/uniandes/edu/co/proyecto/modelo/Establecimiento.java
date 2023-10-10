package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="establecimientos")
public class Establecimiento {

    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private String tipoEstablecimiento;

    private String estilo;

    private Integer capacidad;

    public Establecimiento(){;}

    public Establecimiento(Servicio servicios_id, String tipoEstablecimiento, String estilo, Integer capacidad) {
        this.servicios_id = servicios_id;
        this.tipoEstablecimiento = tipoEstablecimiento;
        this.estilo = estilo;
        this.capacidad = capacidad;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public String getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    public void setTipoEstablecimiento(String tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estiloEstablecimiento) {
        this.estilo = estiloEstablecimiento;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidadEstablecimiento) {
        this.capacidad = capacidadEstablecimiento;
    }

}
