package _02_poo_e_java.lista01._05;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String contato;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String sobrenome, String contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Cliente [contato=" + contato + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
