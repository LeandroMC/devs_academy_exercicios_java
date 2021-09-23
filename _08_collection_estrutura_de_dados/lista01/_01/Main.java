package _08_collection_estrutura_de_dados.lista01._01;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");
        apelidos.forEach((k, v) -> System.out.printf("%s : %s%n", k, v));

        loteriaDosSonhos.forEach((k, v) -> System.out.printf("%d : %s%n", k, v));
    }
}
