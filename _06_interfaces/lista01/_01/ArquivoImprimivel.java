package _06_interfaces.lista01._01;

/**
 * ArquivoImprimivel
 */
public abstract class ArquivoImprimivel implements Imprimivel {

    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}