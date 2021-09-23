package _03_heranca_e_classe_abstrata.ex_banco_digital;

public class Cliente {

    private String numero;
    private String sobrenome;
    private String rg;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", numero=" + numero + ", rg=" + rg + ", sobrenome=" + sobrenome + "]";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
