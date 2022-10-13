package model;

public class Aluno extends Pessoa {

    Integer  matricula;


    public Aluno(String nome, Integer telefone, String dataNascimento, Integer cpf, Integer matricula) {
        super(nome, telefone, dataNascimento, cpf);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}

