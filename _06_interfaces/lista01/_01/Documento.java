package _06_interfaces.lista01._01;

public class Documento extends ArquivoImprimivel {

    Documento(String nome, String tipo) {
        this.setNome(nome);
        this.setTipo(tipo);
    }

    @Override
    public void imprimir() {
        System.out.printf("Sou um documento do Word. %s, tipo %s%n", getNome(), getTipo());
    }
}
