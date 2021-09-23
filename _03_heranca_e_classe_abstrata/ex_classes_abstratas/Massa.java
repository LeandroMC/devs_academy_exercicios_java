package _03_heranca_e_classe_abstrata.ex_classes_abstratas;

public class Massa extends Lanche {

    private String molho;
    private TiposDeMassa tipoDeMassa;

    public Massa(String molho, TiposDeMassa massa) {
        this.molho = molho;
        this.tipoDeMassa = massa;
        setTempoDePreparo(30);
    }

    @Override
    public void calcularEntrega(double distancia) {
        System.out.printf("Seu lanche chegará em %d minutos %n", (int) (getTempoDePreparo() + (distancia * 10)));
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public TiposDeMassa getTipoDeMassa() {
        return tipoDeMassa;
    }

    public void setTipoDeMassa(TiposDeMassa tipoDeMassa) {
        this.tipoDeMassa = tipoDeMassa;
    }

}
