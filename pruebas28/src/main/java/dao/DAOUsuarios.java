/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import to.TOUsuarios;
import java.util.Date;

/**
 *
 * @author Pochito ACA SE DEFINEN LAS FUNCIONALIDADES RELACIONADAS CON LA
 * ENTIDAD
 */
public class DAOUsuarios {

    private ConexionDb con;
    private final String nombreTabla = "Usuarios";
    //private final String[] columnas = {"cedula", "nombre", "apellido", "tipoUsuario", "telefono", "email", "contraseña", "usuario", "estadoDelUsuario", "fechaIngreso", "fechaEgreso"};

    
    public DAOUsuarios(){
        try {
            con = new ConexionDb();
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.constructor: " + ex.getMessage());
        }
    }

    public int insertarUsuario(TOUsuarios ToUsuario) {
        String[] valores = {ToUsuario.getCedula(), ToUsuario.getNombre(), ToUsuario.getApellido(), ToUsuario.getTipoUsuario(), ToUsuario.getTelefono(), ToUsuario.getEmail(), ToUsuario.getContraseña(), ToUsuario.getUsuario(), ToUsuario.getEstadoDelUsuario(), ToUsuario.getFechaIngreso().toString(), ToUsuario.getFechaEgreso().toString()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.insertarUsuario: " + ex.getMessage());
            return 0;
        }

    }
    
    public boolean actualizarUsuario(TOUsuarios ToUsuario) {
        String[] valores = {ToUsuario.getCedula(), ToUsuario.getNombre(), ToUsuario.getApellido(), ToUsuario.getTipoUsuario(), ToUsuario.getTelefono(), ToUsuario.getEmail(), ToUsuario.getContraseña(), ToUsuario.getUsuario(), ToUsuario.getEstadoDelUsuario(), ToUsuario.getFechaIngreso().toString(), ToUsuario.getFechaEgreso().toString()};
        try {
            return con.actualizar(nombreTabla, valores, 0);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.actualizarUsuario: " + ex.getMessage());
            return false;
        }

    }
    
    public boolean eliminarUsuario(int idUsuario) {  
        try {
            return con.borrar(nombreTabla, idUsuario);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.eliminarUsuario: " + ex.getMessage());
            return false;
        }

    }
    
    public ArrayList<TOUsuarios> listarUsuarios() {
        ArrayList<TOUsuarios> usuarios=new ArrayList<>();
        TOUsuarios usuario;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                usuario=new TOUsuarios();
                usuario.setCedula(rs.getString("cedula"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setEmail(rs.getString("email"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setEstadoDelUsuario(rs.getString("estadoDelUsuario"));
                usuario.setFechaIngreso(rs.getDate("fechaIngreso"));
                usuario.setFechaEgreso(rs.getDate("fechaEgreso"));
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuarios.listarUsuario: " + ex.getMessage());
            return null;
        }

    }
    
    

}
