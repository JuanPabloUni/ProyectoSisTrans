package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Establecimiento;


public interface EstablecimientoRepository extends JpaRepository <Establecimiento, Integer> {
    
    @Query(value = "SELECT * FROM establecimientos", nativeQuery = true)
    Collection<Establecimiento> darEstablecimientos();

    @Query(value = "SELECT * FROM establecimientos WHERE servicios_id = :servicios_id", nativeQuery = true)
    Establecimiento darEstablecimiento(@Param("servicios_id") int id);

}
