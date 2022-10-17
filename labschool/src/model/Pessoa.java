package model;


import java.util.UUID;

public class Pessoa {


    private String nome;
    private String telefone;
    private String dataNascimento;
    private String cpf;
    private UUID codigo = UUID.randomUUID();


    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
