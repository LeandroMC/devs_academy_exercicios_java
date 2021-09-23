package _03_heranca_e_classe_abstrata.ex_classes_abstratas;

public abstract class Lanche {

    private double preco;
    private int tempoDePreparo;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public abstract void calcularEntrega(double distancia);

}
