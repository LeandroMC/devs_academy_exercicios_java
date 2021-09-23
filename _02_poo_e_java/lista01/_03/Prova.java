package _02_poo_e_java.lista01._03;

public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    public boolean podeRealizar(Atleta atleta) {
        if (atleta.getEnergia() >= energiaNecessaria && atleta.getNivel() >= dificuldade) {
            return true;
        }

        return false;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    @Override
    public String toString() {
        return "Prova [dificuldade=" + dificuldade + ", energiaNecessaria=" + energiaNecessaria + "]";
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

}
