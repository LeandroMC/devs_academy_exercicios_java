package _02_poo_e_java.lista02;

import java.time.LocalDate;

public class Funcionario {

    private String endereco;
    private String nome;
    private String cpf;
    private String email;
    private String setor;
    private LocalDate dataDeAdmissao;
    private LocalDate dataDeDemissao;
    private LocalDate dataUltimaFerias;
    private double salarioBase;
    private boolean deFerias;

    public void consultarContraCheque() {
        System.out.println(salarioBase);
    }

    public void requisitarFerias() {
        long tempoDeContratacao = (LocalDate.now().toEpochDay() - dataDeAdmissao.toEpochDay()) / 30;
        long tempoSemFerias = (LocalDate.now().toEpochDay() - dataDeAdmissao.toEpochDay()) / 30;

        if (tempoDeContratacao >= 11 && tempoSemFerias >= 4 && !deFerias) {
            System.out.println("Férias concedidas");
            deFerias = true;
        }
    }

    public void trabalhar() {
        if (!deFerias)
            System.out.println("Trabalhando");
    }

    public void pedirDemissao() {
    }

    public void solicitarAumento(double valor) {

        if (Math.floor(Math.random() * 1) + 1 >= 1) {
            System.out.println("Aumento concedido");
            salarioBase += valor;
        } else {
            System.out.println("Aumento negado");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
