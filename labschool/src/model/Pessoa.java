package model;
import javax.xml.crypto.Data;
import java.lang.Math;

public class Pessoa {


    private String nome;
    private Integer  telefone;
    private String dataNascimento;
    private Integer  cpf;
    private double codigo = Math.random();



    public Pessoa(String nome, Integer telefone, String dataNascimento, Integer cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf=" + cpf +
                ", codigo=" + codigo +
                '}';
    }
}
