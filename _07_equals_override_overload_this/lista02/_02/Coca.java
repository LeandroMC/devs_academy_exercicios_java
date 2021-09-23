package _07_equals_override_overload_this.lista02._02;

import java.util.Objects;

public class Coca {

    private int tamanho;
    private double preco;

    Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coca c = (Coca) obj;
        return tamanho == c.tamanho;
    }

}
