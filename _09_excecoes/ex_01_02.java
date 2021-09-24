package _09_excecoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ex_01_02 {

    public static void main(String[] args) {

        List<String> animais = new ArrayList<>();

        animais.add("Pato");
        animais.add("Cachorro");
        animais.add("Gato");

        // IndexOutOfBoundsException exception
        // System.out.println(animais.get(3));

        try {
            System.out.println(animais.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Exceção!%nTipo: %s%n", e.toString());
        }

        // ArrayList<String> animais2 = null;
        ArrayList<String> animais2 = new ArrayList<>();

        // NullPointerException exception
        // animais2.add("Pato");
        // animais2.add("Cachorro");
        // animais2.add("Gato");
        animais2.add("Pato");
        animais2.add("Cachorro");
        animais2.add("Gato");

        try {
            System.out.println(animais2.get(5));
        } catch (NullPointerException e) {
            System.out.printf("Exceção!%nTipo: %s%n", e.toString());
        }

    }
}
