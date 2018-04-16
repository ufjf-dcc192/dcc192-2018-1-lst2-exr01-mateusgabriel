package lst02;


public class Usuario {

    Album a;
    String nome;

    public Usuario(String nome, int i) {
        this.nome = nome;
        this.a = new Album(i);
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
