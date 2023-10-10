package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.PlanDeConsumo;

public interface PlanDeConsumoRepository extends JpaRepository<PlanDeConsumo, Integer> {

    @Query(value = "SELECT * FROM planesdeconsumo", nativeQuery = true)
    Collection<PlanDeConsumo> darPlanesDeConsumo();

    @Query(value = "SELECT * FROM planesdeconsumo WHERE id = :id", nativeQuery = true)
    PlanDeConsumo darPlanDeConsumo(@Param("id") int id);
    
}
