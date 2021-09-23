package _02_poo_e_java.lista01._05;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private List<Venda> vendas;

    Concessionaria() {
        vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

}
