package _03_heranca_e_classe_abstrata.ex_banco_digital;

public class Conta {

    private Cliente titular;
    private double saldo;

    public Conta(Cliente titular) {
        this.titular = titular;
        saldo = 0.0;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso%n", valor);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso%n", valor);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Seu saldo é de R$%.2f %n", saldo);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
