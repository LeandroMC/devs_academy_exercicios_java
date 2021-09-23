package _04_loops_e_arrays;

import java.util.Scanner;

public class _03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        while (n > 0) {
            int num = input.nextInt();
            System.out.printf("%d --> %d %n", num, _02.fatorial(num));

        }

        input.close();
    }
}
