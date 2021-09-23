package _02_poo_e_java.lista01._05;

public class Ex05 {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Ferrari", "Enzo", 2014, "Preto", 45000);
        Cliente cliente = new Cliente("Leandro", "Magalhães", "leandro@magalhaes.com");
        Venda venda = new Venda(cliente, veiculo, 350000);
        Concessionaria concessionaria = new Concessionaria();

        concessionaria.registrarVenda(venda);

        concessionaria.getVendas().forEach(System.out::println);
    }
}
