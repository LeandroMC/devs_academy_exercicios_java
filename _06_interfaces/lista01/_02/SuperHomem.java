package _06_interfaces.lista01._02;

/**
 * SuperHome
 */
public class SuperHomem implements Voador {

    private int experiencia;

    SuperHomem() {
        experiencia = 0;
    }

    @Override
    public void voar() {
        experiencia += 3;
        System.out.println("Estou voando como um campeão");
        System.out.println("XP: " + getExperiencia());
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}