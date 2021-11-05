package co.edu.unicundi.discotiendajar.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

/**
 *
 * @author acer
 */
/*@Entity
@Table (name = "ventas", schema = "tienda")*/
public class Ventas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //@Column(name = "nombre_cliente", nullable = false, length = 20)
    private String nombreCliente;
    
    //@Column(name = "apellido_cliente", nullable = false, length = 20)
    private String apellidoCliente;
    
    //@Column(name = "celular", nullable = false, length = 20)
    private String celular;
    
    //@Column(name = "correo", nullable = false, length = 20)
    private String correo;
    
    //@Column(name = "direccion", nullable = false, length = 20)
    private String direccion;
    
    //@Column(name = "metodo_pago", nullable = false, length = 20)
    private String metodoPago;
    
    //@Column(name = "fecha_compra", nullable = false, length = 20)
    private Timestamp fechaCompra;
    
    //@Column(name = "cantidad_articulos", nullable = false, length = 20)
    private Integer cantidadArticulos;
    
    //@Column(name = "total", nullable = false, length = 20)
    private Double total;

    public Ventas() {
    }

    public Ventas(String nombreCliente, String apellidoCliente, String celular, String correo, String direccion, String metodoPago, Timestamp fechaCompra, Integer cantidadArticulos, Double total) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
        this.fechaCompra = fechaCompra;
        this.cantidadArticulos = cantidadArticulos;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(Integer cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
