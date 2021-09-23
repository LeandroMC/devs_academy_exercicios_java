package _02_poo_e_java.lista02;

public class Supervisor extends Funcionario {

    public void consultarContraCheque() {
        System.out.println(getSalarioBase() + (getSalarioBase() * 0.08));
    }

    public boolean demitirFuncionario(Funcionario funcionario) {
        if (funcionario == null)
            return false;

        if (!(funcionario instanceof Gerente) && !(funcionario instanceof Supervisor)) {
            System.out.printf("O funcionário %s foi demitido pelo supervisor %s %n", funcionario.getNome(), getNome());
        }
        return true;
    }
}
