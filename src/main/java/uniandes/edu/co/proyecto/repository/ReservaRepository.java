package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Reserva;
import uniandes.edu.co.proyecto.modelo.Servicio;

public interface ReservaRepository extends JpaRepository <Reserva, Integer> {

    @Query(value = "SELECT * FROM reservas", nativeQuery = true)
    Collection<Reserva> darReservas();
    
    @Query(value = "SELECT * FROM reservas WHERE id = :id", nativeQuery = true)
    Reserva darReserva(@Param("id") int id);
}
