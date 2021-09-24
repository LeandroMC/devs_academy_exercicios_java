package _09_excecoes.ex02;

public class Teste {

    public static void main(String[] args) {

        CalculoMatematico cm = new CalculoMatematico();

        // ArithmeticException
        // System.out.println(cm.divisao(4, 0));

        try {

            System.out.println(cm.divisao(4, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
