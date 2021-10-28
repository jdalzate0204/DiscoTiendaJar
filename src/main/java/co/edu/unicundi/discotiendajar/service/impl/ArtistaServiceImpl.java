package co.edu.unicundi.discotiendajar.service.impl;

import co.edu.unicundi.discotiendajar.entity.Artista;
import co.edu.unicundi.discotiendajar.repository.IArtistaRepo;
import co.edu.unicundi.discotiendajar.service.IArtistaService;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author acer
 */
public class ArtistaServiceImpl implements IArtistaService{

    /*@EJB
    public IArtistaRepo repo;*/
    
    @Override
    public void guardar(Artista obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Artista> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Artista listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Artista obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
