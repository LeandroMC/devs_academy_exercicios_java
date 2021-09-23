package _06_interfaces.lista01._02;

public class Main {

    public static void main(String[] args) {

        Pato p1 = new Pato();
        Aviao a1 = new Aviao();
        SuperHomem superHomem = new SuperHomem();
        TorreDeControle tdc = new TorreDeControle();

        tdc.adicionarVoador(p1);
        tdc.adicionarVoador(a1);
        tdc.adicionarVoador(superHomem);

        tdc.voemTodos();
        tdc.voemTodos();
        tdc.voemTodos();
        tdc.voemTodos();

    }
}
