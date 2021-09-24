package _08_collection_estrutura_de_dados.lista01._04;

public class Peca {

    private String marca;
    private String modelo;

    @Override
    public String toString() {
        return "Peca [marca=" + marca + ", modelo=" + modelo + "]";
    }

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
