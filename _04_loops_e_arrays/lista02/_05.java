package _04_loops_e_arrays.lista02;

import java.util.Scanner;

public class _05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n = input.nextInt();
        System.out.println("Digite o segundo número");
        int m = input.nextInt();
        System.out.println("Digite a operação [+, -, *, /]");
        String op = input.next();
        double result;

        switch (op) {
            case "+":
                result = m + n;
                break;
            case "-":
                result = m - n;
                break;
            case "*":
                result = m * n;
                break;
            case "/":
                result = m / n;
                break;
            default:
                result = 0;
        }
        System.out.println(result);

        input.close();

    }

}
