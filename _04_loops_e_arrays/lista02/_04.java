package _04_loops_e_arrays.lista02;

import java.util.Scanner;

/**
 * _ex04
 */
public class _04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n = input.nextInt();
        System.out.println("Digite o segundo número");
        int m = input.nextInt();

        if (n > m) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (n < m) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os número são iguais");
        }

        input.close();
    }
}