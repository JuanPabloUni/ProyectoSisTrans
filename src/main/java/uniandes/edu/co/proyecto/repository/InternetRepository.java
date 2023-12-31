package uniandes.edu.co.proyecto.repository;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.Internet;
import uniandes.edu.co.proyecto.modelo.Servicio;

public interface InternetRepository extends JpaRepository <Servicio, Integer> {
    
    @Query(value = "SELECT * FROM internet", nativeQuery = true)
    Collection<Internet> darInternets();

    @Query(value = "SELECT * FROM internet WHERE servicios_id = :servicios_id", nativeQuery = true)
    Internet darInternet(@Param("servicios_id") int id);

}
