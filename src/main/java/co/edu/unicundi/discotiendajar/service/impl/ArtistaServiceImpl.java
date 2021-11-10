package co.edu.unicundi.discotiendajar.service.impl;

import co.edu.unicundi.discotiendajar.dto.ArtistaDto;
import co.edu.unicundi.discotiendajar.entity.*;
import co.edu.unicundi.discotiendajar.repository.IArtistaRepo;
import co.edu.unicundi.discotiendajar.service.IArtistaService;
import java.util.List;
import javax.ejb.*;

/**
 *
 * @author acer
 */
@Stateless
public class ArtistaServiceImpl implements IArtistaService{
    
    @EJB
    public IArtistaRepo repo;
    
    @Override
    public List<Sexo> obtenerSexo() {
        return this.repo.obtenerSexo();
    }

    @Override
    public List<GeneroMusical> obtenerGenero() {
        return this.repo.obtenerGenero();
    }
    
    @Override
    public void guardar(ArtistaDto obj) {
       
        Sexo sexo=new Sexo();
        sexo.setId(obj.getIdSexo());
        GeneroMusical genero=new GeneroMusical();
        genero.setId(obj.getIdGeneroMusical());
        Artista artista=new Artista();
        artista.setFechaNacimiento(obj.getFechaNacimiento());
        artista.setGeneroMusical(genero);
        artista.setNacionalidad(obj.getNacionalidad());
        artista.setNombre(obj.getNombre());
        artista.setSexo(sexo);

      this.repo.guardar(artista);
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
