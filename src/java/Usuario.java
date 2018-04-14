
public class Usuario {

    Album a = new Album();
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Album getA() {
        return a;
    }

    public void setA(Album a) {
        this.a = a;
    }
}
