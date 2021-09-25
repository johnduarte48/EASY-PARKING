<%-- 
    Document   : PlazasController
    Created on : 24/09/2021, 9:27:53 p. m.
    Author     : Pochito
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="to.TOPlazas"%>
<%@page import="Controller.ControllerPlazas"%>
<%-- ACA SE PONE EL CODIGO LLAMANDO AL CONTROLADOR --%>
<% ControllerPlazas controladorPlazas = new ControllerPlazas();
//Ahora se definen los parametros con los que se hace la busqueda en el campo de URL de la página
    String opcion = request.getParameter("opcion");
//opciones como insertar, eliminar, consultar,listar, etc
    if ("listar".equals(opcion)) {
        ArrayList<TOPlazas> plazas = controladorPlazas.listarPlazas();
        out.print(new Gson().toJson(plazas));
    } else if ("insertar".equals(opcion)) {
        
    } else if ("actualizar".equals(opcion)) {
        
    } else if ("eliminar".equals(opcion)) {
        
    } else {
        out.print("Esta opción no está disponible");
    }
%>
