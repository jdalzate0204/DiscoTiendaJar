/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.discotiendajar.service.impl;

import co.edu.unicundi.discotiendajar.entity.Administrador;
import co.edu.unicundi.discotiendajar.repository.IAdministradorRepo;
import co.edu.unicundi.discotiendajar.service.IAdministradorService;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.*;


/**
 *
 * @author ALEJANDRA
 */
public class AdministradorServiceImpl implements IAdministradorService {
    
    @EJB
    public IAdministradorRepo repo;
    
    @Override
    public void login(Administrador obj) {
         int contador = this.repo.login(obj.getUsuario(),obj.getContrasena());
            if (contador == 1) {
                
            }
        
    }

    @Override
    public void guardar(Administrador obj) {
        try {
            //encripto
            String cadenaEncriptada = encriptar(obj.getContrasena());
            
            Administrador administrador=new Administrador();
            administrador.setRol(obj.getRol());
            administrador.setContrasena(obj.getContrasena());
            administrador.setUsuario(obj.getUsuario());
            
            this.repo.guardar(administrador);
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AdministradorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
      private static String encriptar(String s)  throws UnsupportedEncodingException{
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }
    
    
}
