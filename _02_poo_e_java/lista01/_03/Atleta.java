package _02_poo_e_java.lista01._03;

public class Atleta {

    private String nome;
    private int energia;
    private int nivel;

    public Atleta(String nome) {
        this.nome = nome;
        energia = 100;
        nivel = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
