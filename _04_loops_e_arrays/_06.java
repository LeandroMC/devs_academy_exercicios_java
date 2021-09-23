package _04_loops_e_arrays;

import java.util.Scanner;

public class _06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de termos");
        int n = input.nextInt();
        System.out.println("Digite o valor de x");
        int x = input.nextInt();
        int divisor = 1;
        boolean crescendo = false;
        double total = 0;

        System.out.println("============================");

        System.out.println("S = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ** %d / %d!%n", x, i + 2, divisor);
            total += ((Math.pow(x, i + 2)) / fatorial(divisor));
            total *= (-1);
            System.out.println(total);

            if (divisor == 4) {
                crescendo = !crescendo;
            } else if (divisor == 1) {
                crescendo = !crescendo;
            }
            if (crescendo) {
                divisor++;
            } else {
                divisor--;
            }
        }

        input.close();
    }

    static int fatorial(int n) {
        int acc = n;
        while (n > 1) {
            acc *= (n - 1);
            n--;
        }
        return acc;
    }
}
