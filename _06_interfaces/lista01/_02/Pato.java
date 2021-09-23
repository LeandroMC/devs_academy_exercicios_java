package _06_interfaces.lista01._02;

public class Pato implements Voador {

    private int energia;

    Pato() {
        energia = 100;
    }

    @Override
    public void voar() {
        energia -= 5;
        System.out.println("Estou voando como um pato");
        System.out.println("Energia: " + getEnergia());
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}
