/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.DAOVehiculos;
import java.util.ArrayList;
import to.TOVehiculos;

/**
 *
 * @author Pochito
 */
public class ControllerVehiculos {
    DAOVehiculos vehiculosDAO=new DAOVehiculos();
    
    
    public int insertarVehiculo(TOVehiculos ToVehiculo) {
        return vehiculosDAO.insertarVehiculo(ToVehiculo);
    }
    
    public boolean actualizarVehiculo(TOVehiculos ToVehiculo) {
        return vehiculosDAO.actualizarVehiculo(ToVehiculo);
    }
    
    public boolean eliminarVehiculo(int idVehiculo) {  
        return vehiculosDAO.eliminarVehiculo(idVehiculo);
    }
    
    public ArrayList<TOVehiculos> listarVehiculos() {
        return vehiculosDAO.listarVehiculos();
    }
}
