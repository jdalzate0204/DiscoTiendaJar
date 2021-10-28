package co.edu.unicundi.discotiendajar.repository.impl;

import co.edu.unicundi.discotiendajar.entity.Artista;
import co.edu.unicundi.discotiendajar.repository.IArtistaRepo;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author acer
 */
public class ArtistaRepoImpl implements IArtistaRepo {
    
    @PersistenceContext(unitName = "conexionDiscoTienda")
    private EntityManager em;

    @Override
    public void guardar(Artista obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Artista> listarTodos() {
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
    public void eliminar(Artista obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
