package _06_interfaces.lista01._01;

public class Main {

    public static void main(String[] args) {

        Contrato contrato = new Contrato("Contrato de locação de imóvel", "Residencial");
        Foto foto = new Foto("Foto de Fim de ano", "Comemorativa");
        Documento documento = new Documento("CNH", "Oficial");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();
    }
}
