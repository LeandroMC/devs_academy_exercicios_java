package _02_poo_e_java.lista01._01;

/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private String Sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        Sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

}