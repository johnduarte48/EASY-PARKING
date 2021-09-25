/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import to.TOPlazas;

/**
 *
 * @author Pochito
 */
public class DAOPlazas {
    private ConexionDb con;
    private final String nombreTabla = "Plazas";
    
    public DAOPlazas(){
        try {
            con = new ConexionDb();
        } catch (Exception ex) {
            System.out.println("Error en DAOPlazas.constructor: " + ex.getMessage());
        }
    }

    public int insertarPlaza(TOPlazas ToPlaza) {
        String[] valores = {String.valueOf(ToPlaza.getIdPlazas()), ToPlaza.getTipoPlaza(), ToPlaza.getEstadoDePlaza()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOPlazas.insertarPlaza: " + ex.getMessage());
            return 0;
        }

    }
    
    public boolean actualizarPlaza(TOPlazas ToPlaza) {
        String[] valores = {String.valueOf(ToPlaza.getIdPlazas()), ToPlaza.getTipoPlaza(), ToPlaza.getEstadoDePlaza()};
        try {
            return con.actualizar(nombreTabla, valores, 0);
        } catch (Exception ex) {
            System.out.println("Error en DAOPlazas.actualizarPlaza: " + ex.getMessage());
            return false;
        }

    }
    
    public boolean eliminarPlaza(int idPlaza) {  
        try {
            return con.borrar(nombreTabla, idPlaza);
        } catch (Exception ex) {
            System.out.println("Error en DAOPlazas.eliminaridPlaza: " + ex.getMessage());
            return false;
        }

    }
    
    public ArrayList<TOPlazas> listarPlazas() {
        ArrayList<TOPlazas> plazas=new ArrayList<>();
        TOPlazas plaza;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                plaza=new TOPlazas();
                plaza.setIdPlazas(rs.getInt("idPlazas"));
                plaza.setTipoPlaza(rs.getString("tipoPlaza"));
                plaza.setEstadoDePlaza(rs.getString("estadoDePlaza"));
                plazas.add(plaza);
            }
            return plazas;
        } catch (Exception ex) {
            System.out.println("Error en DAOPlazas.listarPlaza: " + ex.getMessage());
            return null;
        }

    }
    
}
