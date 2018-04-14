<%@page import="java.util.List"%>
<%@page import="lst02.Figurinha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Figurinhas</title>
    </head>
    <body>
        <h1>Lista de Figurinhas</h1>
        <ul>
            <%
                List<Figurinha> figurinhas = (List<Figurinha>) request.getAttribute("figurinhas");            
                for(int i = 0; i < figurinhas.size(); i++){             
            %>
            <li><a href="cromo.html?linha<%=i%>"><%=figurinhas.get(i).getNome()%></li>
            <%}%>
        </ul>
    </body>
</html>
