package _04_loops_e_arrays;

import java.util.Scanner;

public class _02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int e = 0;

        // e = 1 + 1! + 1 + 2! + 1 + 3! + 1 + 4! + 1 + 5! ... + 1/N!

        for (int i = 1; i <= n; i++) {
            e += 1 + fatorial(i);
        }

        e = (e + 1) / n;

        System.out.println(e);

        input.close();
    }

    // n * n-1 * n-2 * n-3 ...
    static int fatorial(int n) {
        int acc = n;
        while (n > 1) {
            acc *= (n - 1);
            n--;
        }
        return acc;
    }
}
