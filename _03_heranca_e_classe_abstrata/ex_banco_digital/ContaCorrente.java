package _03_heranca_e_classe_abstrata.ex_banco_digital;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositarCheque(Cheque cheque) {
        if (cheque.getValor() > 0) {
            setSaldo(getSaldo() + cheque.getValor());
        }
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$%.2f realizado com sucesso%n", valor);
        } else if (limiteChequeEspecial >= valor) {
            limiteChequeEspecial -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso(Utilizando o cheque especial)%n", valor);
        } else if (getSaldo() + limiteChequeEspecial >= valor) {
            double resto = valor % getSaldo();
            setSaldo(0.0);
            limiteChequeEspecial -= resto;
            System.out.printf("Saque de R$%.2f realizado com sucesso(Utilizando o saldo + cheque especial)%n", valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O seu saldo é de R$%.2f e o seu cheque especial é R$%.2f %n", getSaldo(),
                limiteChequeEspecial);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

}
