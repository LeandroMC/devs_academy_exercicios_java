package _07_equals_override_overload_this.lista02._03;

public class Aluno {

    private String nome;
    private int numeroDeAluno;

    Aluno(String nome, int numero) {

        this.nome = nome;
        this.numeroDeAluno = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(int numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Aluno a = (Aluno) obj;

        return this.numeroDeAluno == a.numeroDeAluno;
    }

}
