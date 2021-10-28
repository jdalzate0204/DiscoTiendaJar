package co.edu.unicundi.discotiendajar.repository;

import co.edu.unicundi.discotiendajar.entity.Album;
import javax.ejb.Local;

/**
 *
 * @author PAULA GUZMAN
 */
@Local
public interface IAlbumRepo extends ICrud<Album, Integer> {
    
}
