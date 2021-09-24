package _02_poo_e_java.lista01._04;

public class Tripe {

    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public Tripe(int alturaMinima, int alturaMaxima) {
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        alturaAtual = alturaMinima;
        dobrado = true;
    }

    public void definirAltura(int novaAltura) {
        alturaAtual = novaAltura;
    }

    public void dobrar() {
        dobrado = true;
    }

    public void desdobrar() {
        dobrado = false;
    }

    public void guardar() {
        if (prontoParaGuardar()) {
            System.out.println("Tripé guardado");
        } else {
            System.out.println("O tripé deve estar dobrado e a sua altura deve ser a menor possível.");
        }
    }

    public boolean prontoParaGuardar() {
        if (dobrado && alturaAtual == alturaMinima)
            return true;
        return false;
    }

    public void usar() {
        if (prontoParaUsar()) {
            System.out.println("Usando tripé");
        } else {
            System.out.println(
                    "O tripé deve estar desdobrado e com altura superior à metade da altura máxima para poder ser usado.");
        }
    }

    public boolean prontoParaUsar() {
        if (!dobrado && alturaAtual > alturaMaxima / 2)
            return true;
        return false;
    }

}
