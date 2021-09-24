package _02_poo_e_java.lista01._04;

public class ex04 {

    public static void main(String[] args) {

        Tripe tripe = new Tripe(50, 150);

        System.out.println("Tripé dobrado e com altura mínima");
        tripe.usar();
        tripe.desdobrar();
        tripe.usar();
        tripe.definirAltura(76);
        tripe.usar();
        tripe.guardar();
    }
}
