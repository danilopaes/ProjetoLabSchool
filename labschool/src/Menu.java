import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        do{
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Pedagogo");
            System.out.println("4 - Atualiza Matricula do Aluno");
            System.out.println("5 - Agenda Atendimento Pedagogo");
            System.out.println("6 - Lista de Pessoas");
            System.out.println("7 - Relatorio Alunos");
            System.out.println("8 - Relatorio Professores");
            System.out.println("9 - Relatorio dos Alunos mais Atendidos pelo Pedagogo");
            System.out.println("10 - Relatorio dos Pedagogos com mais Atendimentos");

            opcao = teclado.nextInt();


        }while(opcao != 0);

    }
    
}
