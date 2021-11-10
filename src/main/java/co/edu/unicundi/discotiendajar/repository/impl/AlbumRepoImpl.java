package co.edu.unicundi.discotiendajar.repository.impl;

import co.edu.unicundi.discotiendajar.entity.Album;
import java.util.List;
import javax.persistence.*;
import co.edu.unicundi.discotiendajar.repository.IAlbumRepo;
import javax.ejb.Stateless;

/**
 *
 * @author PAULA GUZMAN
 */
@Stateless
public class AlbumRepoImpl implements IAlbumRepo {
 
    @PersistenceContext(unitName = "conexionDiscoTienda")
    private EntityManager em;

    @Override
    public void guardar(Album obj) {
        this.em.persist(obj);
    }

    @Override
    public List<Album> listarTodos() {
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
    public void eliminar(Album obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
