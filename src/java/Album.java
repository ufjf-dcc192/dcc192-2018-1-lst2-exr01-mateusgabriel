
import java.util.List;

public class Album {
    String nome;
    private List<Figurinha> figurinhas;
    private List<Figurinha> repetidas;
    private List<Figurinha> possuidas;

    public Album(List<Figurinha> figurinhas, List<Figurinha> repetidas, List<Figurinha> possuidas) {
        this.figurinhas = figurinhas;
        this.repetidas = repetidas;
        this.possuidas = possuidas;
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
