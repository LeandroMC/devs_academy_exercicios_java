package _03_heranca_e_classe_abstrata.ex_banco_digital;

import java.time.LocalDate;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private LocalDate dataDePagamento;

    public Cheque(double valor, String bancoEmissor, LocalDate dataDePagamento) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataDePagamento = dataDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public LocalDate getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(LocalDate dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

}
