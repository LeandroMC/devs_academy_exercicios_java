package _02_poo_e_java.lista01._02;

public class JogadoDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadoDeFutebol(String nome) {
        this.nome = nome;
        energia = 100;
        alegria = 50;
        gols = 0;
        experiencia = 0;
    }

    public void fazerGol() {
        energia -= 5;
        alegria += 10;
        gols += 1;
        System.out.println("GOOOOOOL!");
    }

    public void correr() {
        energia -= 10;
        System.out.println("Cansei");
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

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void ganharExperiencia() {
        this.experiencia++;
    }

}
