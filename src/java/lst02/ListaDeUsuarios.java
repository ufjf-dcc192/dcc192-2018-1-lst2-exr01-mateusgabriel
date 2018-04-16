package lst02;


import java.util.ArrayList;
import java.util.List;

public class ListaDeUsuarios {
    private static int i;
    private static List<Usuario> usuarios;

    public static List<Usuario> getInstance() {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
            usuarios.add(new Usuario("Reginaldo", i));
            usuarios.add(new Usuario("Rogerin", i++));
            usuarios.add(new Usuario("Nem", i++));
        }
        return usuarios;
    }
}
