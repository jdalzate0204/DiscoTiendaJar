package co.edu.unicundi.discotiendajar.repository;

import co.edu.unicundi.discotiendajar.entity.Artista;
import javax.ejb.Local;

/**
 *
 * @author acer
 */
@Local
public interface IArtistaRepo extends ICrud<Artista, Integer> {
    
}
