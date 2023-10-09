package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="salones")
public class Salon {
    
    @Id
    @OneToOne
    @JoinColumn(name = "sevicios_id", referencedColumnName = "id")
    private Servicio servicios_id;

    private String tipoSalon;

    private Integer horasLimpieza;

    private Float costoXHora;

    public Salon(){;}

    public Salon(Servicio servicios_id, String tipoSalon, Integer horasLimpieza, Float costoXHora) {
        this.servicios_id = servicios_id;
        this.tipoSalon = tipoSalon;
        this.horasLimpieza = horasLimpieza;
        this.costoXHora = costoXHora;
    }

    public Servicio getServicios_id() {
        return servicios_id;
    }
    
    public void setServicios_id(Servicio servicios_id) {
        this.servicios_id = servicios_id;
    }

    public String getTipoSalon() {
        return tipoSalon;
    }

    public void setTipoSalon(String tipoSalon) {
        this.tipoSalon = tipoSalon;
    }

    public Integer getHorasLimpieza() {
        return horasLimpieza;
    }

    public void setHorasLimpieza(Integer horasLimpieza) {
        this.horasLimpieza = horasLimpieza;
    }

    public Float getCostoXHora() {
        return costoXHora;
    }

    public void setCostoXHora(Float costoXHora) {
        this.costoXHora = costoXHora;
    }

}