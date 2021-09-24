package _08_collection_estrutura_de_dados.lista01._04;

import java.util.Arrays;

/**
 * ex04
 */
public class ex04 {

    public static void main(String[] args) {

        Peca p1 = new Peca("Hering", "Polo Azul");
        Peca p2 = new Peca("Hering", "Bermuda Linho");
        GuardaVolumes gv = new GuardaVolumes();
        int id = gv.guardarPecas(Arrays.asList(p1, p2));

        gv.mostrarPecas();
        gv.devolverPecas(id);
        gv.mostrarPecas();
    }
}