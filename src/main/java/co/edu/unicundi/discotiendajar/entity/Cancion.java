package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author acer
 */
@Entity
@Table (name = "cancion", schema = "principal")
public class Cancion implements Serializable {
    
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
    @Pattern(regexp = "^([01]?[0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9])?$", message = "¡Ingrese el formato 00:00:00!")
    @Column(name = "duracion", nullable = false)
    private Time duracion;
    
    @NotNull(message = "colaboraciones es obligatorio")
    @Column(name = "colaboraciones", nullable = true)
    private String colaboraciones;
    
    @NotNull(message = "precio es obligatorio")
    @Min(value = 2000)
    @Pattern(regexp = "^\\d+$", message = "¡Solo se admiten numeros!")
    @Column(name = "precio", nullable = false)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_album", nullable = false)
    private Album album;
    
    @OneToOne
    @JoinColumn(name = "id_formato", nullable = false)
    private Formato formato;

    public Cancion() {
    }

    public Cancion(String nombre, String descripcion, Time duracion, String colaboraciones, Double precio, Album album, Formato formato) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.colaboraciones = colaboraciones;
        this.precio = precio;
        this.album = album;
        this.formato = formato;
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

    //@XmlTransient
    @JsonIgnore
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    //@XmlTransient
    @JsonIgnore
    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
