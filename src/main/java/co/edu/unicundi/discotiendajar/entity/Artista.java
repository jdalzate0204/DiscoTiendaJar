package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 *
 * @author acer
 */
@Entity
@Table (name = "artista")
public class Artista implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull(message = "nombre es obligatorio")
    @Size(min = 3, max = 50, message = "nombre debe estar entre 3 y 50 caracteres")
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @NotNull(message = "fechaNacimiento es obligatorio")
    @Column(name = "fecha_nacimiento", nullable = false)
    private DateFormat fechaNacimiento;
    
    @NotNull(message = "genero es obligatorio")
    @Size(min = 8, max = 9, message = "genero debe tener máximo 9 caracteres")
    @Column(name = "sexo", nullable = false, length = 9)
    private String sexo;
    
    @NotNull(message = "nacionalidad es obligatorio")
    @Size(min = 4, max = 20, message = "nacionalidad debe tener máximo 20 caracteres")
    @Column(name = "nombre", nullable = false, length = 20)
    private String nacionalidad;
    
    @NotNull(message = "generoMusical es obligatorio")
    @Size(min = 3, max = 30, message = "generoMusical debe máximo 30 caracteres")
    @Column(name = "genero_musical", nullable = false, length = 30)
    private String generoMusical;
    
    /*@OneToMany(mappedBy = "artista", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Album> album;*/

    public Artista() {
    }

    public Artista(String nombre, DateFormat fechaNacimiento, String sexo, String nacionalidad, String generoMusical) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.generoMusical = generoMusical;
        //this.album = album;
        //, List<Album> album
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DateFormat getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(DateFormat fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    /*public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }*/
}
