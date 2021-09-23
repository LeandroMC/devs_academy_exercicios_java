package _02_poo_e_java.lista02;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Funcionario funcionario = new Funcionario();

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(gerente);
        funcionarios.add(supervisor);
        funcionarios.add(funcionario);
    }
}
