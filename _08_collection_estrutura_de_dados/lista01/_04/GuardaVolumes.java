package _08_collection_estrutura_de_dados.lista01._04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List> dic;
    private int cont;

    public int guardarPecas(List<Peca> listadePecas) {
        cont++;
        dic.put(cont, listadePecas);
        return cont;
    }

    public static void main(String[] args) {

        GuardaVolumes gv = new GuardaVolumes();

        List<String> pecas = new ArrayList<>();
        pecas.add("camisa");
        pecas.add("calça");

        // gv.guardarPecas(pecas);
    }
}
