package cli;

public class Operacao {

    public static Operacao codigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        if(codigo < 0 || codigo >= operacoes.length) {
            return null;
        }
        return operacoes[codigo-1];
    }
    
}
