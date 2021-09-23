package _07_equals_override_overload_this.lista02._02;

public class Main {

    public static void main(String[] args) {

        Coca c1 = new Coca(1, 5.5);
        Coca c2 = new Coca(1, 5.8);

        System.out.println(c1.equals(c2));
    }
}
