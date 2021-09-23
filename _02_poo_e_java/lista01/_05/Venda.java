package _02_poo_e_java.lista01._05;

public class Venda {

    private Cliente cliente;
    private Veiculo veiculo;
    private double valorDaVenda;

    public Venda(Cliente cliente, Veiculo veiculo, double valorDaVenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorDaVenda = valorDaVenda;
    }

    @Override
    public String toString() {
        return "Venda [cliente=" + cliente + ", valorDaVenda=" + valorDaVenda + ", veiculo=" + veiculo + "]";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

}
