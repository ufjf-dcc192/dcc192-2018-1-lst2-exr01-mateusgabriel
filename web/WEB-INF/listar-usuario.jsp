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
            <li><a> Administrar álbum </a>.</li>
            <% 
                for(int i = 0; i < ListaDeUsuarios.getInstance.size(); i++){
                Usuario usuarios = ListaDeUsuarios.getInstance.get(i)
            %>
            <li></li>
            <%}%>
        </ul>
            
    </body>
</html>
