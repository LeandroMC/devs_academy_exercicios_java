package _01_introducao_a_poo.ex01;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Cliente 1";
        cliente.sobrenome = "Sobrenomecliente";

        Conta conta = new Conta();
        conta.numeroDaConta = "1234";
        conta.saldo = 0.0;
        conta.titular = cliente;

        conta.depositar(1000);
        conta.sacar(1200);
        conta.sacar(300);
    }
}
