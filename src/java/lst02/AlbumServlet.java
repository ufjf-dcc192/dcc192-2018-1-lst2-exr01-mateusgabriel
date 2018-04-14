package lst02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlbumServlet", urlPatterns = {"/usuario.html"})
public class AlbumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/usuario.html".equals(req.getServletPath()))
        {
            listarUsuarios(req, resp);
        }
    }

    private void listarUsuarios(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        req.setAttribute("usuarios", usuarios);
        RequestDispatcher despachante = req.getRequestDispatcher("/WEB-INF/listar-usuario.jsp");
        despachante.forward(req, resp);
    }

    
}
