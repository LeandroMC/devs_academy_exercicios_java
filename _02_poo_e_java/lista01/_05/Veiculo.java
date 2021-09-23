package _02_poo_e_java.lista01._05;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private int quilometragem;

    Veiculo() {
        super();
    }

    public Veiculo(String marca, String modelo, int anoDeFabricacao, String cor, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Veiculo [anoDeFabricacao=" + anoDeFabricacao + ", cor=" + cor + ", marca=" + marca + ", modelo="
                + modelo + ", quilometragem=" + quilometragem + "]";
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

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

}
