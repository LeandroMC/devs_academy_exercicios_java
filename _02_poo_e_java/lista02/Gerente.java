package _02_poo_e_java.lista02;

public class Gerente extends PessoaFisica {

    @Override
    public void consultarContraCheque() {
        System.out.println(getSalarioBase() + (getSalarioBase() * 0.12));
    }

    public boolean demitirFuncionario(Funcionario funcionario) {
        if (funcionario == null)
            return false;

        if (!(funcionario instanceof Gerente)) {
            System.out.printf("O funcionário %s foi demitido pelo gerente %s %n", funcionario.getNome(), getNome());
        }
        return true;
    }

    public boolean reajustarSalario(Funcionario funcionario, double valor) {
        if (funcionario instanceof Gerente || funcionario == null)
            return false;
        funcionario.setSalarioBase(funcionario.getSalarioBase() + valor);
        return true;
    }

}
