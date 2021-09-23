package _06_interfaces.lista01._01;

public class Impressora {

    private Imprimivel[] imprimiveis;
    private int index;

    Impressora() {
        imprimiveis = new Imprimivel[3];
        index = 0;
    }

    public void imprimirTudo() {
        for (Imprimivel imprimivel : imprimiveis) {
            imprimivel.imprimir();
        }
        index = 0;
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        imprimiveis[index] = umImprimivel;
        index++;
    }

    public Imprimivel[] getImprimiveis() {
        return imprimiveis;
    }

    public void setImprimiveis(Imprimivel[] imprimiveis) {
        this.imprimiveis = imprimiveis;
    }

}
