package co.edu.unicundi.discotiendajar.service.impl;

import co.edu.unicundi.discotiendajar.entity.Cancion;
import co.edu.unicundi.discotiendajar.repository.ICancionRepo;
import co.edu.unicundi.discotiendajar.service.ICancionService;
import java.util.List;
import javax.ejb.*;

/**
 *
 * @author acer
 */
@Stateless
public class CancionServiceImpl implements ICancionService {

    /*@EJB
    public ICancionRepo repo;*/
    
    @Override
    public void guardar(Cancion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cancion> listar() {
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
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
