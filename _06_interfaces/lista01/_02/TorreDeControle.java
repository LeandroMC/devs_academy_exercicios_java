package _06_interfaces.lista01._02;

/**
 * TorreDeControle
 */
public class TorreDeControle {

    private Voador[] voadores = new Voador[10];

    public void adicionarVoador(Voador voador) {
        for (int i = 0; i < voadores.length; i++) {
            if (voadores[i] == null) {
                voadores[i] = voador;
                break;
            }
        }
    }

    public void voemTodos() {
        for (int i = 0; i < voadores.length; i++) {
            if (voadores[i] != null) {
                voadores[i].voar();
            } else {
                break;
            }
        }
    }
}