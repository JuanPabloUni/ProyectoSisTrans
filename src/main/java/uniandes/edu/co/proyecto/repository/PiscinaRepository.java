package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Piscina;
import uniandes.edu.co.proyecto.modelo.Servicio;

public interface PiscinaRepository extends JpaRepository <Servicio, Integer> {

    @Query(value = "SELECT * FROM piscinas", nativeQuery = true)
    Collection<Piscina> darPiscinas();
    
    @Query(value = "SELECT * FROM piscinas WHERE servicios_id = :servicios_id", nativeQuery = true)
    Piscina darPiscina(@Param("servicios_id") int id);

}
