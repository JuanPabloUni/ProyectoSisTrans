package uniandes.edu.co.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.modelo.CuentaConsumo;

public interface CuentaConsumoRepository extends JpaRepository <CuentaConsumo, Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cuentaConsumos (reservas_id, servicios_id) VALUES (:reservas_id, :servicios_id)", nativeQuery = true)
    void insertarCuentaConsumo(@Param("reservas_id") int reservas_id, @Param("servicios_id") int servicios_id);
    
}
