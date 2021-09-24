package _04_loops_e_arrays.lista02;

import java.util.Scanner;

public class _01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = -1;

        while (true) {
            if (n < 0 || n > 10)
                System.out.println("Por favor digite uma nota de 0 a 10");
            n = input.nextInt();
        }

    }
}
