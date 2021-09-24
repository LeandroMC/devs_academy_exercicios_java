package _04_loops_e_arrays.lista01;

import java.util.Arrays;
import java.util.Scanner;

public class _08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos");
        int n = input.nextInt();
        int[] termos = new int[3 + n];
        int m = 2;
        termos[0] = 2;
        termos[1] = 7;
        termos[2] = 3;

        for (int i = 3; i < termos.length; i++) {
            termos[i] = termos[i - 3] * m;
            m++;
            if (m == 5)
                m = 2;

        }
        System.out.println(Arrays.toString(termos));

        input.close();
    }
}
