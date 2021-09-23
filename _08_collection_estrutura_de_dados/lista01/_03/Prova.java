package _08_collection_estrutura_de_dados.lista01._03;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros) {
        int soma = 0;

        for (int inteiro : conjuntoDeInteiros) {
            soma += inteiro;
        }
        System.out.println(soma);
    }
}
