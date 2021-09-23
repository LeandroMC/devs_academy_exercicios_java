package _03_heranca_e_classe_abstrata.ex_banco_digital;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta conta = new ContaCorrente(cliente, 200);

        conta.consultarSaldo();
        conta.depositar(500);
        conta.consultarSaldo();
        conta.sacar(1000);
        conta.sacar(650);
        conta.consultarSaldo();

    }
}
