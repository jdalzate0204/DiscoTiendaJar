package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author acer
 */
@Entity
@Table (name = "cancion")
public class Cancion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull(message = "nombre es obligatorio")
    @Size(min = 4, max = 30, message = "nombre debe estar entre 4 y 30 caracteres")
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    
    @NotNull(message = "descripción es obligatorio")
    @Size(min = 5, max = 150, message = "descripción debe estar entre 5 y 20 caracteres")
    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;
    
    @NotNull(message = "duracion es obligatorio")
    @Column(name = "duracion", nullable = false)
    private Time duracion;
    
    @NotNull(message = "formato es obligatorio")
    @Size(min = 3, max = 3, message = "formato solo debe tener 3 caracteres")
    @Column(name = "formato", nullable = false, length = 3)
    private String formato;
    
    @NotNull(message = "colaboraciones es obligatorio")
    @Column(name = "colaboraciones", nullable = true)
    private String colaboraciones;
    
    @NotNull(message = "precio es obligatorio")
    @Min(value = 2000)
    @Column(name = "precio", nullable = false)
    private Double precio;
    
    /*@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_album", nullable = false)
    private Album album;*/

    public Cancion() {
    }

    public Cancion(String nombre, String descripcion, Time duracion, String formato, String colaboraciones, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.formato = formato;
        this.colaboraciones = colaboraciones;
        this.precio = precio;
        //this.album = album;
        //, Album album
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(String colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /*public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }*/
}
