package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author acer
 */
@Entity
@Table (name = "formato", schema = "adicional")
public class Formato implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "descripcion", nullable = false, length = 3)
    private String descripcion;

    public Formato() {
    }

    public Formato(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}