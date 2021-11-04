package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author PAULA GUZMAN
 */
@Entity
@Table (name = "album")
public class Album implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull(message = "nombre es obligatorio")
    @Size(min = 5, max = 20, message = "nombre debe estar entre 5 y 20 caracteres")
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    
    @NotNull(message = "imagen es obligatorio")
    @Column(name = "imagen", nullable = true)
    private String imagen;
    
    @NotNull(message = "descripción es obligatorio")
    @Size(min = 5, max = 150, message = "descripción debe estar entre 5 y 20 caracteres")
    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;
    
    @NotNull(message = "fechaLanzamiento es obligatorio")
    @Column(name = "fecha_lanzamiento", nullable = false)
    private Date fechaLanzamiento;
    
    @NotNull(message = "precio es obligatorio")
    @Min(value = 10000)
    @Column(name = "precio", nullable = false)
    private Double precio;

    /*@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_artista", nullable = false)
    private Artista artista;
    
    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cancion> cancion;*/
    
    public Album() {
    }

    public Album(String nombre, String imagen, String descripcion, Date fechaLanzamiento, Double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        /*this.artista = artista;
        this.cancion = cancion;*/
        //, Artista artista, List<Cancion> cancion
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /*public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(List<Cancion> cancion) {
        this.cancion = cancion;
    }*/
}
