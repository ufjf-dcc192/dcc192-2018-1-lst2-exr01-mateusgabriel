package lst02;


import java.util.ArrayList;
import java.util.List;

public class Album {

    private int id;
    String nome = "Copa do Mundo 2018";
    private List<Figurinha> figurinhas;

    public Album(int i) {
        this.id = i;
        figurinhas = new ArrayList<>();
        figurinhas.add(new Figurinha(1, "Escudo Rússia"));
        figurinhas.add(new Figurinha(2, "Escudo Arábia Saudita"));
        figurinhas.add(new Figurinha(3, "Escudo Egito"));
        figurinhas.add(new Figurinha(4, "Escudo Uruguai"));
        figurinhas.add(new Figurinha(5, "Escudo Portugal"));
        figurinhas.add(new Figurinha(6, "Escudo Espanha"));
        figurinhas.add(new Figurinha(7, "Escudo Iran"));
        figurinhas.add(new Figurinha(8, "Escudo Marrocos"));
        figurinhas.add(new Figurinha(9, "Escudo França"));
        figurinhas.add(new Figurinha(10, "Escudo Austrália"));
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
