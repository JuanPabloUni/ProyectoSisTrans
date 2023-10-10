package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uniandes.edu.co.proyecto.modelo.OfrecenProducto;

public interface OfrecenProductoRepository extends JpaRepository<OfrecenProducto, Integer> {

    @Query(value = "SELECT * FROM ofrecenproductos", nativeQuery = true)
    Collection<OfrecenProducto> darOfrecenProductos();
    
}
