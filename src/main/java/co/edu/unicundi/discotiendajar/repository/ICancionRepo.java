package co.edu.unicundi.discotiendajar.repository;

import co.edu.unicundi.discotiendajar.entity.Cancion;
import javax.ejb.Local;

/**
 *
 * @author acer
 */
@Local
public interface ICancionRepo extends ICrud<Cancion, Integer> {
    
}
