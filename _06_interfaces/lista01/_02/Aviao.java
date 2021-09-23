package _06_interfaces.lista01._02;

import java.util.Objects;

/**
 * Aviao
 */
public class Aviao implements Voador {

    private double horasDeVoo;

    Aviao() {
        horasDeVoo = 0;
    }

    @Override
    public void voar() {
        horasDeVoo += 13;
        System.out.println("Estou voando como um pato");
        System.out.printf("Horas de voo: %.1f%n", getHorasDeVoo());
    }

    public double getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(double horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horasDeVoo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aviao other = (Aviao) obj;
        return Double.doubleToLongBits(horasDeVoo) == Double.doubleToLongBits(other.horasDeVoo);
    }

}