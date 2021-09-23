package _03_heranca_e_classe_abstrata.ex_banco_digital;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros;

    public ContaPoupanca(Cliente cliente, double taxaDeJuros) {
        super(cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void recolherJuros() {
        System.out.println("Juros");
    }

}
