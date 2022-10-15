package model;

public class Professor extends Pessoa {
    
    private String experienciaDesenvolvimento;
    private String formacao;
    private Boolean estado;


    public Professor(String nome, String telefone, String dataNascimento, String cpf, String experienciaDesenvolvimento, String formacao, Boolean estado) {
        super(nome, telefone, dataNascimento, cpf);
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
        this.formacao = formacao;
        this.estado = estado;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "experienciaDesenvolvimento='" + experienciaDesenvolvimento + '\'' +
                ", formacao='" + formacao + '\'' +
                ", estado=" + estado +
                "} " + super.toString();
    }
}
    
