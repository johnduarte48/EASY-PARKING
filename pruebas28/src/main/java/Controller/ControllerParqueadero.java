/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.DAOParqueadero;
import java.util.ArrayList;
import to.TOParqueadero;

/**
 *
 * @author Pochito
 */
public class ControllerParqueadero {
    DAOParqueadero ParqueaderoDAO=new DAOParqueadero();
    
    
    public int insertarParqueadero(TOParqueadero ToParqueadero) {
        return ParqueaderoDAO.insertarParqueadero(ToParqueadero);
    }
    
    public boolean actualizarParqueadero(TOParqueadero ToParqueadero) {
        return ParqueaderoDAO.actualizarParqueadero(ToParqueadero);
    }
    
    public boolean eliminarParqueadero(int idParqueadero) {  
        return ParqueaderoDAO.eliminarParqueadero(idParqueadero);
    }
    
    public ArrayList<TOParqueadero> listarParqueadero() {
        return ParqueaderoDAO.listarParqueadero();
    }
}
