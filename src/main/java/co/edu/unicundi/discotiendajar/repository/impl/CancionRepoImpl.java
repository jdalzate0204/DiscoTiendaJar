package co.edu.unicundi.discotiendajar.repository.impl;

import co.edu.unicundi.discotiendajar.entity.Cancion;
import co.edu.unicundi.discotiendajar.repository.ICancionRepo;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author acer
 */
public class CancionRepoImpl implements ICancionRepo {

    @PersistenceContext(unitName = "conexionDiscoTienda")
    private EntityManager em;
    
    @Override
    public void guardar(Cancion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cancion> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cancion listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Cancion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cancion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
