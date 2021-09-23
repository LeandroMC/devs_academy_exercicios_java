package _04_loops_e_arrays;

import java.util.Scanner;

public class _10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int qtdDiv = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                qtdDiv++;
                if (qtdDiv > 1)
                    break;
            }
        }
        String resposta = qtdDiv > 1 ? "Número não é primo" : "Número Primo";

        System.out.println(resposta);

        input.close();
    }
}
