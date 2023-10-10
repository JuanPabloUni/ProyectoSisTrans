package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Prestamo;

public class PrestamoRepository {
    
}

// public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

//     // @Query(value = "SELECT * FROM prestamos", nativeQuery = true)
//     // Collection<Prestamo> darPrestamos();

//     // @Query(value = "SELECT * FROM prestamos WHERE servicios_id = :servicios_id", nativeQuery = true)
//     // Prestamo darPrestamo(@Param("servicios_id") int id);
    
// }
