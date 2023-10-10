package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String apellido;

    private String documento;

    @ManyToOne
    @JoinColumn(name =  "tiposusuarios_id", referencedColumnName = "id")
    private TipoUsuario tiposusuarios_id;

    public Usuario(){;}

    public Usuario(String nombre, String apellido, String documento, TipoUsuario tiposusuarios_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tiposusuarios_id = tiposusuarios_id;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoUsuario getTiposusuarios_id() {
        return tiposusuarios_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public void setApellido(String apellido) {
        this.apellido= apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTiposusuarios_id(TipoUsuario tiposusuarios_id) {
        this.tiposusuarios_id = tiposusuarios_id;
    }
    
}
