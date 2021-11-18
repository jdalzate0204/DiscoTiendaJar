/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.discotiendajar.service;

import co.edu.unicundi.discotiendajar.entity.Administrador;

/**
 *
 * @author ALEJANDRA
 */
public interface IAdministradorService {
    public void login(Administrador obj);
    public void guardar(Administrador  obj) ;
  
}
