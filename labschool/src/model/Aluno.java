package model;

public class Aluno extends Pessoa {

    private String matricula;

    private Double notaProcesso;

    private Integer totalAtendimentoAluno =0 ;


    public Aluno(String nome, String telefone, String dataNascimento, String cpf, String matricula, Double notaProcesso) {
        super(nome, telefone, dataNascimento, cpf);
        this.matricula = matricula;
        this.notaProcesso = notaProcesso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", notaProcesso=" + notaProcesso +
                ", totalAtendimentoAluno=" + totalAtendimentoAluno +
                "} " + super.toString();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTotalAtendimentoAluno(Integer totalAtendimentoAluno) {
        this.totalAtendimentoAluno = totalAtendimentoAluno;
    }

    public Integer getTotalAtendimentoAluno() {
        return totalAtendimentoAluno;
    }
}
