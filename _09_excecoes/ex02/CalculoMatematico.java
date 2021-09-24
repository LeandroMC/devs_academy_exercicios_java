package _09_excecoes.ex02;

public class CalculoMatematico {

    public double divisao(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Não é possível dividir por zero");
        return a / b;
    }
}
