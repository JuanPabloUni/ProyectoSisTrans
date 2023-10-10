package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Servicio;

public interface ServicioRepository extends JpaRepository <Servicio, Integer> {

    @Query(value = "SELECT * FROM servicios", nativeQuery = true)
    Collection<Servicio> darServicios();
    
    @Query(value = "SELECT * FROM servicios WHERE id = :id", nativeQuery = true)
    Servicio darServicio(@Param("id") int id);
}
