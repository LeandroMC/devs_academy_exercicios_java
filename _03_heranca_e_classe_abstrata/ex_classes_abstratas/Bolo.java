package _03_heranca_e_classe_abstrata.ex_classes_abstratas;

public class Bolo extends Lanche {

    private String massa;
    private String recheio;
    private String cobertura;

    public Bolo(String massa, String recheio, String cobertura) {
        this.massa = massa;
        this.recheio = recheio;
        this.cobertura = cobertura;
        setTempoDePreparo(10);
    }

    @Override
    public void calcularEntrega(double distancia) {
        System.out.printf("Seu lanche chegará em %d minutos %n", (int) (getTempoDePreparo() + (distancia * 10)));
    }

}
