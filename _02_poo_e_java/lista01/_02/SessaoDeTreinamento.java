package _02_poo_e_java.lista01._02;

public class SessaoDeTreinamento {

    private int experiencia;

    public void treinarA(JogadoDeFutebol jogador) {
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        System.out.printf("Experiência inicial: %d%n", jogador.getExperiencia());
        jogador.ganharExperiencia();
        System.out.printf("Experiência final: %d%n", jogador.getExperiencia());
    }
}
