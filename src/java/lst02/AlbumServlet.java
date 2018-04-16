package lst02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlbumServlet", urlPatterns = {"/usuario.html", "/album.html", "/cromo.html"})
public class AlbumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/usuario.html".equals(req.getServletPath()))
        {
            listarUsuarios(req, resp);
        }
        else if ("/album.html".equals(req.getServletPath()))
        {
            listarAlbuns(req, resp);
        }
        else if ("/cromo.html".equals(req.getServletPath()))
        {
            listarFigurinhas(req, resp);
        }
    }

    private void listarUsuarios(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        req.setAttribute("usuarios", usuarios);
        RequestDispatcher despachante = req.getRequestDispatcher("/WEB-INF/listar-usuario.jsp");
        despachante.forward(req, resp);
    }

    private void listarAlbuns(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        int codigo = Integer.parseInt(req.getParameter("linha"));
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        Album a = usuarios.get(codigo).getA();
        req.setAttribute("albuns", a);
        RequestDispatcher despachante = req.getRequestDispatcher("/WEB-INF/listar-album.jsp");
        despachante.forward(req, resp);
    }

    private void listarFigurinhas(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        int codigo = Integer.parseInt(req.getParameter("linha"));
        List<Figurinha> figurinhas = new ArrayList<>();
        List<Usuario> usuarios = ListaDeUsuarios.getInstance();
        for(Usuario u: usuarios)
        {
            if (u.getA().getId() == codigo)
            {
                figurinhas = u.getA().getFigurinhas();
            }
        }
        req.setAttribute("figurinhas", figurinhas);
        RequestDispatcher despachante = req.getRequestDispatcher("/WEB-INF/listar-figurinha.jsp");
        despachante.forward(req, resp);
    }
}