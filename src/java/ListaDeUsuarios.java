
import java.util.ArrayList;
import java.util.List;

public class ListaDeUsuarios {
    private static List<Usuario> usuarios;

    public static List<Usuario> getInstance() {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
            usuarios.add(new Usuario("Reginaldo"));
            usuarios.add(new Usuario("Rogerin157"));
            usuarios.add(new Usuario("Nem"));
        }
        return usuarios;
    }
}
