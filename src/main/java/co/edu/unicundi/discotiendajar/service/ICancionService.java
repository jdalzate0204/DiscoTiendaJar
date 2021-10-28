package co.edu.unicundi.discotiendajar.service;

import co.edu.unicundi.discotiendajar.entity.Cancion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author acer
 */
@Local
public interface ICancionService {
    public void guardar(Cancion obj);
    public List<Cancion> listar();
    public Cancion listarPorId(Integer id);
    public void editar(Cancion obj);
    public void eliminar(Integer id);
}
