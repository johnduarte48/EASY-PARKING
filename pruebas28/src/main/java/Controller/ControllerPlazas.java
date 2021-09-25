/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.DAOPlazas;
import java.util.ArrayList;
import to.TOPlazas;

/**
 *
 * @author Pochito
 */
public class ControllerPlazas {
    DAOPlazas PlazasDAO=new DAOPlazas();
    
    
    public int insertarPlaza(TOPlazas ToPlaza) {
        return PlazasDAO.insertarPlaza(ToPlaza);
    }
    
    public boolean actualizarPlaza(TOPlazas ToPlaza) {
        return PlazasDAO.actualizarPlaza(ToPlaza);
    }
    
    public boolean eliminarPlaza(int idPlaza) {  
        return PlazasDAO.eliminarPlaza(idPlaza);
    }
    
    public ArrayList<TOPlazas> listarPlazas() {
        return PlazasDAO.listarPlazas();
    }
}
