package _04_loops_e_arrays.lista01;

import java.util.Scanner;

public class _05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /**
         * [alturaAtual, alturaAtualNumero, maiorAltura, maiorAlturaNumero, menorAltura,
         * menorAlturaNumero]
         */
        int[] alturasENumeros = new int[6];
        alturasENumeros[4] = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Altura do %d° aluno %n", i + 1);
            alturasENumeros[0] = input.nextInt();
            System.out.printf("Número do %d° aluno %n", i + 1);
            alturasENumeros[1] = input.nextInt();

            if (alturasENumeros[0] > alturasENumeros[2]) {
                alturasENumeros[2] = alturasENumeros[0];
                alturasENumeros[3] = alturasENumeros[1];
                if (alturasENumeros[0] < alturasENumeros[4]) {
                    alturasENumeros[4] = alturasENumeros[0];
                    alturasENumeros[5] = alturasENumeros[1];
                }
            } else if (alturasENumeros[0] < alturasENumeros[4]) {
                alturasENumeros[4] = alturasENumeros[0];
                alturasENumeros[5] = alturasENumeros[1];
            }

        }

        System.out.printf("Maior altura: %d. Número: %d%n", alturasENumeros[2], alturasENumeros[3]);
        System.out.printf("Menor altura: %d. Número: %d%n", alturasENumeros[4], alturasENumeros[5]);

        input.close();
    }
}
