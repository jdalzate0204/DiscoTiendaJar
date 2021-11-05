package co.edu.unicundi.discotiendajar.entity;

import javax.persistence.*;

/**
 *
 * @author acer
 */
/*@Entity
@Table (name = "ventas", schema = "tienda")*/
public class Ventas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
