package _02_poo_e_java.lista01._03;

import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Usain");
        Atleta atleta2 = new Atleta("Phelps");

        atleta1.setEnergia((int) Math.floor(Math.random() * 100) + 1);
        atleta1.setNivel((int) Math.floor(Math.random() * 100) + 1);
        atleta2.setEnergia((int) Math.floor(Math.random() * 100) + 1);
        atleta2.setEnergia((int) Math.floor(Math.random() * 100) + 1);
        atleta2.setNivel((int) Math.floor(Math.random() * 100) + 1);

        Prova p1 = new Prova();
        Prova p2 = new Prova();
        Prova p3 = new Prova();

        p1.setDificuldade((int) Math.floor(Math.random() * 100) + 1);
        p2.setDificuldade((int) Math.floor(Math.random() * 100) + 1);
        p3.setDificuldade((int) Math.floor(Math.random() * 100) + 1);
        p2.setEnergiaNecessaria((int) Math.floor(Math.random() * 100) + 1);
        p1.setEnergiaNecessaria((int) Math.floor(Math.random() * 100) + 1);
        p3.setEnergiaNecessaria((int) Math.floor(Math.random() * 100) + 1);

        System.out.println(p1.podeRealizar(atleta1));
        System.out.println(p2.podeRealizar(atleta2));
        System.out.println(p3.podeRealizar(atleta1));
        System.out.println(p1.podeRealizar(atleta2));
        System.out.println(p2.podeRealizar(atleta1));
        System.out.println(p3.podeRealizar(atleta2));

        Estadio saoJanuario = new Estadio();
        saoJanuario.setProvas(List.of(p1, p2, p3));

        System.out.println(saoJanuario.realizarProvas(atleta1).toString());
        System.out.println(saoJanuario.realizarProvas(atleta2).toString());

    }
}
