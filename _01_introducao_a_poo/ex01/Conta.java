package _01_introducao_a_poo.ex01;

public class Conta {

    String numeroDaConta;
    double saldo;
    Cliente titular;

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
}
