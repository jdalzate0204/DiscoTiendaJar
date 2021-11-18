package co.edu.unicundi.discotiendajar.repository;

import co.edu.unicundi.discotiendajar.entity.Administrador;

/**
 *
 * @author ALEJANDRA
 */
public interface IAdministradorRepo extends ICrud<Administrador, Integer> {
    public int login(String usuario,String contrasena);
    
}
