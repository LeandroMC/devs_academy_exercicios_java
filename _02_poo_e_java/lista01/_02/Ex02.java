package _02_poo_e_java.lista01._02;

public class Ex02 {

    public static void main(String[] args) {

        JogadoDeFutebol jogador1 = new JogadoDeFutebol("Aleijo");
        JogadoDeFutebol jogador2 = new JogadoDeFutebol("Ojiela");

        SessaoDeTreinamento sessao1 = new SessaoDeTreinamento();

        sessao1.treinarA(jogador2);
        sessao1.treinarA(jogador1);
        sessao1.treinarA(jogador1);
        sessao1.treinarA(jogador2);
        sessao1.treinarA(jogador1);

        System.out.println(jogador1.getAlegria());
        System.out.println(jogador1.getGols());

        System.out.println(jogador2.getAlegria());
        System.out.println(jogador2.getGols());

    }
}
