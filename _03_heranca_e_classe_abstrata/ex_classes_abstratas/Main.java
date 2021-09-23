package _03_heranca_e_classe_abstrata.ex_classes_abstratas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Lanche lanche = null;
        String[] ingredientes = new String[3];

        System.out.println("Escolha seu lanche: [1] sanduíches, [2] massas, [3] bolos.");
        int opcao = input.nextInt();

        if (opcao == 1) {
            for (int i = 0; i < ingredientes.length; i++) {
                System.out.printf("Digite o %d° ingrediente %n", i + 1);
                ingredientes[i] = input.nextLine();
            }
            lanche = new Sanduiche(ingredientes);
        } else if (opcao == 2) {
            System.out.println("[1] macarrão, [2] pizza, [3] lasanha.");
            int massaOpcao = input.nextInt();
            System.out.println("Qual será o molho?");
            String molho = input.nextLine();

            if (massaOpcao == 1) {
                lanche = new Massa(molho, TiposDeMassa.MACARRAO);
            } else if (massaOpcao == 2) {

            } else if (massaOpcao == 3) {

            }

        } else if (opcao == 3) {
            lanche = new Bolo("babs", "asfaf", "asas");
        }

        System.out.println("Qual distância da sua residência até o nosso restaurante?");
        double distancia = input.nextDouble();

        lanche.calcularEntrega(distancia);

        input.close();
    }
}
