<%-- 
    Document   : crearUsuario
    Created on : 21-ago-2017, 19:58:43
    Author     : Ricardo Cutimbo
--%>

<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String nombre = request.getParameter("nombre");
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            String direccion = request.getParameter("direccion");
            String nivel = request.getParameter("nivel");         
                String basedatos = "bd_inventario_bitel";
                MongoClient mCliente = new MongoClient("127.0.0.1");
                /*Esta es una version antigua si algun dia falla el sistema es x esto*/
                DB db = mCliente.getDB(basedatos);
                DBCollection coleccion = db.getCollection("usuarios");
                //DBCursor cursor = coleccion.find();
                //BasicDBObject consulta = new BasicDBObject("profesion","contador");

                //Pattern patron = Pattern.compile("J");
                //QueryBuilder consulta = QueryBuilder.start("nombre").regex(patron);
                //DBCursor cursor = coleccion.find(consulta.get());
                BasicDBObject documento = new BasicDBObject();
                documento.put("nombre", nombre);
                documento.put("usuario", usuario);
                documento.put("password", password);
                documento.put("direccion", direccion);
                documento.put("nivel", nivel);
                coleccion.insert(documento);
        %>
        <h1>Usuario ha sido correctamente añadido pero tal ves no, quien sabe no soy un computador</h1>
    </body>
</html>
