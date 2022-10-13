package model;
public class Aluno extends Pessoa {

    int matricula;

    public Aluno() {
        
    }

    public Aluno(String nome, Number telefone, Data dataNascimento, Number cpf, int codigo, int matricula) {
        super(nome, telefone, dataNascimento, cpf, codigo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}

