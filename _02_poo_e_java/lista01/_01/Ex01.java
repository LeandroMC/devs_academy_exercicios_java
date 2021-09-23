package _02_poo_e_java.lista01._01;

public class Ex01 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("John", "Doe");
        Cliente cliente2 = new Cliente("Jack", "Smith");

        Conta conta1 = new Conta("123", 0, cliente1);
        Conta conta2 = new Conta("234", 0, cliente2);

        conta1.depositar(1200);
        conta1.sacar(1500);
        conta1.sacar(200);

        conta2.depositar(1200);
        conta2.sacar(400);
        conta2.sacar(900);
    }
}
