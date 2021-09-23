package _07_equals_override_overload_this.lista02._01;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int rg;

    Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa p = (Pessoa) obj;
        return rg == p.rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

}
