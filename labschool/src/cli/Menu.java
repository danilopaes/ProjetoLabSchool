package cli;
import java.util.Scanner;

import model.Aluno;

public class Menu {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
    
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println();
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Pedagogo");
            System.out.println("4 - Atualiza Matricula do Aluno");
            System.out.println("5 - Realiza Atendimento Pedagogo");
            System.out.println("6 - Lista de Pessoas");
            System.out.println("7 - Relatório Alunos");
            System.out.println("8 - Relatório Professores");
            System.out.println("9 - Relatório dos Alunos mais Atendidos pelo Pedagogo");
            System.out.println("10 - Relatório dos Pedagogos com mais Atendimentos");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");

            opcao = teclado.nextInt();
            System.out.println();

            switch(opcao){
                case 1:
                    System.out.println("Cadastrar Aluno");
                    System.out.println();
                    System.out.print("Digite o nome do aluno: ");
                    aluno.setNome(teclado.next());
                    System.out.print("Digite o telefone do aluno: ");
                    aluno.setTelefone(teclado.next());
                    System.out.print("Digite a data de nascimento do aluno: ");
                    aluno.setDataNascimento(teclado.next());
                    System.out.print("Digite o CPF do aluno: ");
                    aluno.setCpf(teclado.next());
                    System.out.print("Digite o código do aluno: ");
                    aluno.setCodigo(teclado.nextInt());
                    System.out.print("Digite a matrícula do aluno: ");
                    aluno.setMatricula(teclado.nextInt());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Cadastrar Professor");
                    System.out.println();
                    System.out.println("Digite o nome do professor: ");
                    aluno.setNome(teclado.next());
                    System.out.println("Digite o telefone do professor: ");
                    aluno.setTelefone(teclado.next());
                    System.out.println("Digite a data de nascimento do professor: ");
                    aluno.setDataNascimento(teclado.next());
                    System.out.println("Digite o CPF do professor: ");
                    aluno.setCpf(teclado.next());
                    System.out.println("Digite o código do professor: ");
                    aluno.setCodigo(teclado.nextInt());
                    System.out.println("Digite a Formação do professor: ");
                    aluno.setFormacao(teclado.next());
                    System.out.println();
                    System.out.println("Digite Experiencia de Desenvolvimento do professor: ");
                    aluno.setExperienciaDesenvolvimento(teclado.next());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Cadastrar Pedagogo");
                    System.out.println();
                    System.out.println("Digite o nome do pedagogo: ");
                    aluno.setNome(teclado.next());
                    System.out.println("Digite o telefone do pedagogo: ");
                    aluno.setTelefone(teclado.next());
                    System.out.println("Digite a data de nascimento do pedagogo: ");
                    aluno.setDataNascimento(teclado.next());
                    System.out.println("Digite o CPF do pedagogo: ");
                    aluno.setCpf(teclado.next());
                    System.out.println("Digite o código do pedagogo: ");
                    aluno.setCodigo(teclado.nextInt());
                    break;

                case 4:
                    System.out.println("Atualiza Matricula do Aluno");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Realiza Atendimento Pedagogo");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Lista de Pessoas");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Relatório Alunos");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Relatório Professores");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Relatório dos Alunos mais Atendidos pelo Pedagogo");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Relatório dos Pedagogos com mais Atendimentos");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Sair");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println();
                    break;

            }

        }while(opcao != 0);

    }
    
}
