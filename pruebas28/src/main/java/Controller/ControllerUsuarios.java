/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.DAOUsuarios;
import java.sql.ResultSet;
import java.util.ArrayList;
import to.TOUsuarios;

/**
 *
 * @author Pochito
 */
public class ControllerUsuarios {
    DAOUsuarios usuariosDAO=new DAOUsuarios();
    
    
    public int insertarUsuario(TOUsuarios ToUsuario) {
        return usuariosDAO.insertarUsuario(ToUsuario);
    }
    
    public boolean actualizarUsuario(TOUsuarios ToUsuario) {
        return usuariosDAO.actualizarUsuario(ToUsuario);
    }
    
    public boolean eliminarUsuario(int idUsuario) {  
        return usuariosDAO.eliminarUsuario(idUsuario);
    }
    
    public ArrayList<TOUsuarios> listarUsuarios() {
        return usuariosDAO.listarUsuarios();
    }
    
    public TOUsuarios verificarUsuario(String usuario,String clave) {
        return usuariosDAO.verificarUsuario(usuario,clave);
    }
    
}
