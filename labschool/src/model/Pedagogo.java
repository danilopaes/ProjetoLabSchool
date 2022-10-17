package model;

public class Pedagogo extends Pessoa{

private Integer totalAtendimentoPedagogo = 0;


    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);

    }

    @Override
    public String toString() {
        return "Pedagogo{" +
                "totalAtendimentoPedagogo=" + totalAtendimentoPedagogo +
                "} " + super.toString();
    }

    public void setTotalAtendimentoPedagogo(Integer totalAtendimentoPedagogo) {
        this.totalAtendimentoPedagogo = totalAtendimentoPedagogo;
    }

    public Integer getTotalAtendimentoPedagogo() {
        return totalAtendimentoPedagogo;
    }
}
