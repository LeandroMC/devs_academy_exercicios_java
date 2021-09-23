package _07_equals_override_overload_this.lista02._01;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pessoa1", 123456789);
        Pessoa p2 = new Pessoa("Pessoa2", 987654321);

        System.out.println(p1.equals(p2));

        p2.setRg(123456789);

        System.out.println(p1.equals(p2));
    }
}
