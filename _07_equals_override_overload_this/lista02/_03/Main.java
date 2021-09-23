package _07_equals_override_overload_this.lista02._03;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Aluno[] alunos = { new Aluno("Aluno1", 10), new Aluno("Aluno2", 15), new Aluno("Aluno3", 12),
                new Aluno("Aluno4", 18) };

        Aluno a1 = new Aluno("Aluno5", 15);
        Aluno a2 = new Aluno("Aluno6", 22);

        System.out.println(Arrays.asList(alunos).contains(a1));
        System.out.println(Arrays.asList(alunos).contains(a2));
    }
}
