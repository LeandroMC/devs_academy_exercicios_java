package _04_loops_e_arrays.lista01;

import java.util.Arrays;
import java.util.Scanner;

public class _07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de termos:");
        int n = input.nextInt();

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = i;
                continue;
            }
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(Arrays.toString(fibonacci));

        input.close();
    }

}
