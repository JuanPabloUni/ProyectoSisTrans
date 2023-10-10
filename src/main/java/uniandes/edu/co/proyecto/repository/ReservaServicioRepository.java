package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.ReservaServicio;

public interface ReservaServicioRepository extends JpaRepository<ReservaServicio, Integer> {

    @Query(value = "SELECT * FROM reservaservicios", nativeQuery = true)
    Collection<ReservaServicio> darReservaServicios();

    @Query(value = "SELECT * FROM reservaservicios WHERE id = :id", nativeQuery = true)
    ReservaServicio darReservaServicio(@Param("id") int id);
    
}
