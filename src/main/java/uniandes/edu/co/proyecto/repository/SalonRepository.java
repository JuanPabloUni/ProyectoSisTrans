package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Salon;

public class SalonRepository {
    
}

// public interface SalonRepository extends JpaRepository<Salon, Integer> {

//     // @Query(value = "SELECT * FROM salones", nativeQuery = true)
//     // Collection<Salon> darSalones();

//     // @Query(value = "SELECT * FROM salones WHERE servicios_id = :servicios_id", nativeQuery = true)
//     // Salon darSalon(@Param("servicios_id") int servicios_id);
    
// }
