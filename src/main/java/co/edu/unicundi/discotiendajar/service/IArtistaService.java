package co.edu.unicundi.discotiendajar.service;

import co.edu.unicundi.discotiendajar.entity.*;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author acer
 */
//@Local
public interface IArtistaService {
    public void guardar(Artista obj);
    public List<Artista> listar();
    public Artista listarPorId(Integer id);
    public void editar(Artista obj);
    public void eliminar(Integer id);
    public List<Sexo> obtenerSexo();
    public List<GeneroMusical> obtenerGenero();
}
