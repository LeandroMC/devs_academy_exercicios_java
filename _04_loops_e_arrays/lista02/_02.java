package _04_loops_e_arrays.lista02;

import java.util.Scanner;

public class _02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome de usuário");
        String username = input.next();
        System.out.println("Digite a senha");
        String password = input.next();

        while (password.equals(username)) {
            System.out.println("Por favor, digite uma senha diferente do nome de usuário");
            password = input.next();
        }

        input.close();
    }
}
