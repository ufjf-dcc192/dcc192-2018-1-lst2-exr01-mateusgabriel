<%@page import="lst02.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
        <ul>
            <%
                List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");            
                for(int i = 0; i < usuarios.size(); i++){                
            %>
            <li><a href="album.html?linha=<%=i%>"><%=usuarios.get(i).getNome()%></li>
            <%}%>
        </ul>
            
    </body>
</html>
