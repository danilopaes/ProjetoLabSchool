package model;

public class Pedagogo extends Pessoa{

private Integer contador = 0;


    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf, Integer contador) {
        super(nome, telefone, dataNascimento, cpf);
        this.contador = contador;
    }


    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }


    @Override
    public String toString() {
        return "Pedagogo{" +
                "contador=" + contador +
                "} " + super.toString();
    }
}
