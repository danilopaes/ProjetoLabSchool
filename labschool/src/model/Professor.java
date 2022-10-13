package model;

public class Professor extends Pessoa {
    
    private String experienciaDesenvolvimento;
    private String formacao;


    public Professor(String nome, Integer telefone, String dataNascimento, Integer cpf, String experienciaDesenvolvimento, String formacao) {
        super(nome, telefone, dataNascimento, cpf);
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
        this.formacao = formacao;
    }

    public String getExperienciaDesenvolvimento() {
        return experienciaDesenvolvimento;
    }

    public void setExperienciaDesenvolvimento(String experienciaDesenvolvimento) {
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "experienciaDesenvolvimento='" + experienciaDesenvolvimento + '\'' +
                ", formacao='" + formacao + '\'' +
                '}';
    }
}
    
