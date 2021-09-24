/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package to;

import java.util.Date;

/**
 *
 * @author Pochito
 */
public class TOVehiculos {

    // Por parte de la tabla original de Vehiculos
    private int idVehiculos;
    private int idPlaza;
    private int idOperario;
    private String placa;
    private String tipoVehiculo;
    private Date fechaEntrada;
    private Date fechaSalida;
    private double totalPago;
    // Por parte de la tabla de Usuarios
    private int idUsuarios;
    private String cedula;
    private String nombre;
    private String apellido;
    private String tipoUsuario;
    private String telefono;
    private String email;
    private String contraseña;
    private String usuario;
    private String estadoDelUsuario;
    private Date fechaIngreso;
    private Date fechaEgreso;

    //Por parte de la tabla de Plazas
    private int idPlazas;
    private String tipoPlaza;
    private String estadoDePlaza;

    public TOVehiculos() {
    }

    public TOVehiculos(int idVehiculos, int idPlaza, int idOperario, String placa, String tipoVehiculo, Date fechaEntrada, Date fechaSalida, double totalPago) {
        this.idVehiculos = idVehiculos;
        this.idPlaza = idPlaza;
        this.idOperario = idOperario;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.totalPago = totalPago;
    }

    public TOVehiculos(int idVehiculos, int idPlaza, int idOperario, String placa, String tipoVehiculo, Date fechaEntrada, Date fechaSalida, double totalPago, int idUsuarios, String cedula, String nombre, String apellido, String tipoUsuario, String telefono, String email, String contraseña, String usuario, String estadoDelUsuario, Date fechaIngreso, Date fechaEgreso, int idPlazas, String tipoPlaza, String estadoDePlaza) {
        this.idVehiculos = idVehiculos;
        this.idPlaza = idPlaza;
        this.idOperario = idOperario;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.totalPago = totalPago;
        this.idUsuarios = idUsuarios;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.estadoDelUsuario = estadoDelUsuario;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.idPlazas = idPlazas;
        this.tipoPlaza = tipoPlaza;
        this.estadoDePlaza = estadoDePlaza;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstadoDelUsuario() {
        return estadoDelUsuario;
    }

    public void setEstadoDelUsuario(String estadoDelUsuario) {
        this.estadoDelUsuario = estadoDelUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getIdPlazas() {
        return idPlazas;
    }

    public void setIdPlazas(int idPlazas) {
        this.idPlazas = idPlazas;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public String getEstadoDePlaza() {
        return estadoDePlaza;
    }

    public void setEstadoDePlaza(String estadoDePlaza) {
        this.estadoDePlaza = estadoDePlaza;
    }
    
    
    

}
