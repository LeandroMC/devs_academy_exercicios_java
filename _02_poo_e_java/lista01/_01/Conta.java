package _02_poo_e_java.lista01._01;

public class Conta {

    private String numeroDaContra;
    private double saldo;
    private Cliente titular;

    public Conta(String numeroDaContra, double saldo, Cliente titular) {
        this.numeroDaContra = numeroDaContra;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {

        saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso%n", valor);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso%n", valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String getNumeroDaContra() {
        return numeroDaContra;
    }

    public void setNumeroDaContra(String numeroDaContra) {
        this.numeroDaContra = numeroDaContra;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
