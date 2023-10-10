package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Lavanderia;

public interface LavanderiaRepository extends JpaRepository <Lavanderia, Integer> {

    @Query(value = "SELECT * FROM lavanderias", nativeQuery = true)
    Collection<Lavanderia> darLavanderias();

    @Query(value = "SELECT * FROM lavanderias WHERE servicios_id = :servicios_id", nativeQuery = true)
    Lavanderia darLavanderia(@Param("servicios_id") int id);
    
}
