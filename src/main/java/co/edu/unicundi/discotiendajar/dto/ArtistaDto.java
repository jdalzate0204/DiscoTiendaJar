package co.edu.unicundi.discotiendajar.dto;

import java.util.Calendar;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author ALEJANDRA
 */
public class ArtistaDto {

    private Integer id;
    
    @NotNull(message = "nombre es obligatorio")
    @Size(min = 3, max = 50, message = "nombre debe estar entre 3 y 50 caracteres")
    @Pattern(regexp = "^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "¡Solo se admiten letras!")
    private String nombre;
    
    @NotNull(message = "fechaNacimiento es obligatorio")
    private Calendar fechaNacimiento; 
    
    @NotNull(message = "nacionalidad es obligatorio")
    @Size(min = 4, max = 20, message = "nacionalidad debe tener máximo 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z_]+( [a-zA-Z_]+)*$", message = "¡Solo se admiten letras!")
    private String nacionalidad;
    
    @NotNull(message = "idSexo es obligatorio")
    private Integer idSexo;
    
    @NotNull(message = "idGeneroMusical es obligatorio")
    private Integer idGeneroMusical;

    public ArtistaDto() {
    }

    public ArtistaDto(Integer id, String nombre, Calendar fechaNacimiento, String nacionalidad, Integer idSexo, Integer idGeneroMusical) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.idSexo = idSexo;
        this.idGeneroMusical = idGeneroMusical;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the idSexo
     */
    public Integer getIdSexo() {
        return idSexo;
    }

    /**
     * @param idSexo the idSexo to set
     */
    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    /**
     * @return the idGeneroMusical
     */
    public Integer getIdGeneroMusical() {
        return idGeneroMusical;
    }

    /**
     * @param idGeneroMusical the idGeneroMusical to set
     */
    public void setIdGeneroMusical(Integer idGeneroMusical) {
        this.idGeneroMusical = idGeneroMusical;
    }

      public Set<ConstraintViolation<ArtistaDto>> validar(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        return validator.validate(this);
    }
    
}
