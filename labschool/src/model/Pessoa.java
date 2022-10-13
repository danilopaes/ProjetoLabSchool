package model;
import javax.xml.crypto.Data;

public class Pessoa {
    public static void main(String[] args) {
        
    String nome;
    Number telefone;
    Data dataNascimento;
    Number cpf;
    int codigo;

    }

    private String nome;
    private Number telefone;
    private Data dataNascimento;
    private Number cpf;
    private int codigo;

    public Pessoa() {
        
    }

    public Pessoa(String nome, Number telefone, Data dataNascimento, Number cpf, int codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getTelefone() {
        return telefone;
    }

    public void setTelefone(Number telefone) {
        this.telefone = telefone;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Number getCpf() {
        return cpf;
    }

    public void setCpf(Number cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
