package lst02;

public class Figurinha {
    Integer numero;
    String nome;
    Boolean possui;
    Integer qtd;

    public Boolean getPossui() {
        return possui;
    }

    public void setPossui(Boolean possui) {
        this.possui = possui;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Figurinha(Integer numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.possui = false;
        this.qtd = 0;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
