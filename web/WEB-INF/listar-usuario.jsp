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
                for(int i = 0; i < ListaDeUsuarios.getInstance.size; i++)
            %>
            <li><a> Administrar álbum </a>.</li>
        </ul>
            
    </body>
</html>
