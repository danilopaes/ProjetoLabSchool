package model;

public class Aluno extends Pessoa {

    String matricula;


    public Aluno(String nome, String telefone, String dataNascimento, String cpf,String matricula) {
        super(nome, telefone, dataNascimento, cpf);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                "} " + super.toString();
    }
}
