package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author acer
 */
@Entity
@Table (name = "artista", schema = "principal")
public class Artista implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /*@NotNull(message = "nombre es obligatorio")
    @Size(min = 3, max = 50, message = "nombre debe estar entre 3 y 50 caracteres")
    @Pattern(regexp = "^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "¡Solo se admiten letras!")*/
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    //@NotNull(message = "fechaNacimiento es obligatorio")
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    
    /*@NotNull(message = "nacionalidad es obligatorio")
    @Size(min = 4, max = 20, message = "nacionalidad debe tener máximo 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "¡Solo se admiten letras!")*/
    @Column(name = "nacionalidad", nullable = false, length = 20)
    private String nacionalidad;
    
    @OneToOne
    @JoinColumn(name = "id_sexo", nullable = false)
    private Sexo sexo;
    
    @OneToOne
    @JoinColumn(name = "id_genero_musical", nullable = false)
    private GeneroMusical generoMusical;
    
    @OneToMany(mappedBy = "artista", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Album> album;

    public Artista() {
    }

    public Artista(String nombre, Calendar fechaNacimiento, String nacionalidad, Sexo sexo, GeneroMusical generoMusical, List<Album> album) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.generoMusical = generoMusical;
        this.album = album;
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

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //@XmlTransient
    @JsonIgnore
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    //@XmlTransient
    @JsonIgnore
    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }
}
