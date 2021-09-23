package _03_heranca_e_classe_abstrata.ex_classes_abstratas;

public class Sanduiche extends Lanche {

    private String[] ingredientes;

    public Sanduiche(String[] ingredientes) {
        this.ingredientes = ingredientes;
        setTempoDePreparo(15);
    }

    @Override
    public void calcularEntrega(double distancia) {
        System.out.printf("Seu lanche chegará em %d minutos %n", (int) (getTempoDePreparo() + (distancia * 10)));
    }

}
