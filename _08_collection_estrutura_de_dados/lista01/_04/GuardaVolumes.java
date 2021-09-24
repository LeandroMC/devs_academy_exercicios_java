package _08_collection_estrutura_de_dados.lista01._04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> deposito;
    private int cont;

    GuardaVolumes() {
        deposito = new HashMap<>();
        cont = 0;
    }

    public int guardarPecas(List<Peca> listadePecas) {
        cont++;
        deposito.put(cont, listadePecas);
        return cont;
    }

    public void mostrarPecas() {
        deposito.forEach((k, v) -> System.out.printf("%d -> %s%n", k, v));
    }

    public void mostrarPecas(Integer numero) {
        deposito.get(numero).forEach(System.out::println);
    }

    public void devolverPecas(Integer numero) {
        deposito.remove(numero);
    }
}
