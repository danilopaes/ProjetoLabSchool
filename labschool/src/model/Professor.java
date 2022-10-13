package model;
import javax.xml.crypto.Data;

public class Professor extends Pessoa {
    public static void main(String[] args) {
        String formacao;
        String experienciaDesenvolvimento;
  
    }

    private String experienciaDesenvolvimento;
    private String formacao;
    
    public Professor() {
        
    }
    public Professor(String nome, Number telefone, Data dataNascimento, Number cpf, int codigo, String formacao, String experienciaDesenvolvimento) {
        super(nome, telefone, dataNascimento, cpf, codigo);
        this.formacao = formacao;
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getExperienciaDesenvolvimento() {
        return experienciaDesenvolvimento;
    }
    public void setExperienciaDesenvolvimento(String experienciaDesenvolvimento) {
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }
    
}
    
