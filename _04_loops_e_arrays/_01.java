package _04_loops_e_arrays;

import java.time.LocalDate;
import java.util.Arrays;

public class _01 {

    public static void main(String[] args) {

        int anoDeContratacao = 1995;
        int anoCorrente = anoDeContratacao;
        double percentualCorrente = 0.015;
        double salarioInicial = 1000;
        double[] aumentos = new double[LocalDate.now().getYear() - anoDeContratacao + 1];
        double[] salarios = new double[LocalDate.now().getYear() - anoDeContratacao + 1];

        for (int i = 0; i < aumentos.length; i++) {
            if (anoCorrente == anoDeContratacao) {
                aumentos[i] = 0;
                salarios[i] = salarioInicial;
                anoCorrente++;
            } else if (anoDeContratacao + 1 == anoCorrente) {
                aumentos[i] = percentualCorrente;
                salarios[i] = salarios[i - 1] + (salarios[i - 1] * aumentos[i]);
                anoCorrente++;
            } else {
                aumentos[i] = aumentos[i - 1] * 2;
                salarios[i] = salarios[i - 1] + (salarios[i - 1] * aumentos[i]);
                anoCorrente++;
            }
        }

        System.out.println(Arrays.toString(aumentos));
        System.out.println(Arrays.toString(salarios));
        System.out.printf("O salário atual do funcionário é R$%.2f %n", salarios[salarios.length - 1]);
    }
}
