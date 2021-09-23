package _07_equals_override_overload_this.lista02._04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = { new Funcionario("Func1", 1234), new Funcionario("Func2", 2345),
                new Funcionario("Func3", 3456), new Funcionario("Fun4", 3457) };

        Funcionario func1 = new Funcionario("Func2", 2345);
        Funcionario func2 = new Funcionario("Func6", 7345);

        System.out.println(Arrays.asList(funcionarios).contains(func1));
        System.out.println(Arrays.asList(funcionarios).contains(func2));
    }
}
