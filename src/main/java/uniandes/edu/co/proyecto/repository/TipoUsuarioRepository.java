package uniandes.edu.co.proyecto.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uniandes.edu.co.proyecto.modelo.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository <TipoUsuario, Integer> {
    
    @Query(value = "SELECT * FROM tiposUsuario", nativeQuery = true)
    Collection<TipoUsuario> darTiposUsuario();

    @Query(value = "SELECT * FROM tiposUsuario WHERE id = :id", nativeQuery = true)
    TipoUsuario darTipoUsuario(@Param("id") int id);
}