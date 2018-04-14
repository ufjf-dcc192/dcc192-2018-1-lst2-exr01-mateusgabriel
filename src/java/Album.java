
import java.util.ArrayList;
import java.util.List;

public class Album {
    String nome = "Copa do Mundo 2018";
    private static List<Figurinha> figurinhas;
    private static List<Figurinha> repetidas;
    private static List<Figurinha> possuidas;
    
    public static List<Figurinha> getInstance() {
        if (figurinhas == null) {
            figurinhas = new ArrayList<>();
            figurinhas.add(new Figurinha(1, "Primeira Tarefa"));
            figurinhas.add(new Figurinha(2, "Segunda Tarefa"));
            figurinhas.add(new Figurinha(3, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(4, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(5, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(6, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(7, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(8, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(9, "Tarefa Tarefa"));
            figurinhas.add(new Figurinha(10, "Tarefa Tarefa"));
        }
        return figurinhas;
    }

    public Album(List<Figurinha> figurinhas, List<Figurinha> repetidas, List<Figurinha> possuidas) {
        this.figurinhas = figurinhas;
        this.repetidas = repetidas;
        this.possuidas = possuidas;
    }

    public Album() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }

    public List<Figurinha> getRepetidas() {
        return repetidas;
    }

    public void setRepetidas(List<Figurinha> repetidas) {
        this.repetidas = repetidas;
    }

    public List<Figurinha> getPossuidas() {
        return possuidas;
    }

    public void setPossuidas(List<Figurinha> possuidas) {
        this.possuidas = possuidas;
    }
    
    
    
}
