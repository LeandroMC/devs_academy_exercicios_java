package _06_interfaces.lista01._01;

public class Foto extends ArquivoImprimivel {

    Foto(String nome, String tipo) {
        this.setNome(nome);
        this.setTipo(tipo);
    }

    @Override
    public void imprimir() {
        System.out.printf("Sou uma selfie. %s, tipo %s%n", getNome(), getTipo());
    }
}
