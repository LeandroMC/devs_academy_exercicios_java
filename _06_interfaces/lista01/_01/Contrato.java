package _06_interfaces.lista01._01;

public class Contrato extends ArquivoImprimivel {

    Contrato(String nome, String tipo) {
        this.setNome(nome);
        this.setTipo(tipo);
    }

    @Override
    public void imprimir() {
        System.out.printf("Sou um contrato muito legal. %s, tipo %s%n", getNome(), getTipo());
    }
}
