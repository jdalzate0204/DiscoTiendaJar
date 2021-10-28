package co.edu.unicundi.discotiendajar.service.impl;

import co.edu.unicundi.discotiendajar.entity.Album;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import co.edu.unicundi.discotiendajar.repository.IAlbumRepo;
import co.edu.unicundi.discotiendajar.service.IAlbumService;
import java.util.List;

/**
 *
 * @author PAULA GUZMAN
 */
@Stateless
public class AlbumServiceImpl implements IAlbumService {

    /*@EJB
    public IAlbumRepo repo;*/
    
    @Override
    public void guardar(Album obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Album> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Album listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Album obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
