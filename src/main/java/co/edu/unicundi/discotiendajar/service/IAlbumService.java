package co.edu.unicundi.discotiendajar.service;

import co.edu.unicundi.discotiendajar.entity.Album;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAULA GUZMAN
 */
@Local
public interface IAlbumService {
    public void guardar(Album obj);
    public List<Album> listar();
    public Album listarPorId(Integer id);
    public void editar(Album obj);
    public void eliminar(Integer id);
}
