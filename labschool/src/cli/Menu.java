package cli;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Pedagogo;
import model.Pessoa;
import model.Professor;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {

        int opcao;

        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Professor> professores = new ArrayList<Professor>();
        List<Pedagogo> pedagogos = new ArrayList<Pedagogo>();

        do{

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1 - Cadastrar Aluno \n 2 - Cadastrar Professor \n 3 - Cadastrar Pedagogo \n 4 - Atualiza Matricula do Aluno" 
            + "\n 5 - Realiza Atendimento Pedagogo \n 6 - Lista de Pessoas \n 7 - Relatório Alunos \n 8 - Relatório Professores \n 9 - Relatório dos Alunos mais Atendidos pelo Pedagogo \n 10 - Relatório dos Pedagogos com mais Atendimentos \n 0 - Sair"));

            switch(opcao){

                case 1:
                    System.out.println("Cadastrar Aluno");
                    System.out.println();

                    String nomeAluno =JOptionPane.showInputDialog("Digite o nome");
                    String telefoneAluno = JOptionPane.showInputDialog("Digite o telefone");
                    String dataNascimentoAluno = JOptionPane.showInputDialog("Digite a data de nascimento");
                    String cpfAluno = JOptionPane.showInputDialog("Digite o cpf");
                    String matriculaAluno = JOptionPane.showInputDialog("Digite a matricula");

                    Aluno aluno = new Aluno(nomeAluno, telefoneAluno, dataNascimentoAluno, cpfAluno, matriculaAluno);

                    alunos.add(aluno);

                    System.out.println();

                break;

                case 2:
                    System.out.println("Cadastrar Professor");
                    System.out.println();
                    String nomeProfessor = JOptionPane.showInputDialog("Digite o nome");
                    String telefoneProfessor = JOptionPane.showInputDialog("Digite o telefone");
                    String dataNascimentoProfessor = JOptionPane.showInputDialog("Digite a data de nascimento");
                    String cpfProfessor = JOptionPane.showInputDialog("Digite o cpf");
                    String experienciaProfessor = JOptionPane.showInputDialog("Digite a experiencia");
                    String formacaoProfessor = JOptionPane.showInputDialog("Digite a formacao");

                    Professor professor = new Professor(nomeProfessor, telefoneProfessor, dataNascimentoProfessor, cpfProfessor, experienciaProfessor, formacaoProfessor, estadoProfessor);
                    professores.add(professor);

                    System.out.println();
                        
                break;

                case 3:
                    System.out.println("Cadastrar Pedagogo");
                    System.out.println();
                    String nomePedagogo = JOptionPane.showInputDialog("Digite o nome");
                    String telefonePedagogo = JOptionPane.showInputDialog("Digite o telefone");
                    String dataNascimentoPedagogo = JOptionPane.showInputDialog("Digite a data de nascimento");
                    String cpfPedagogo = JOptionPane.showInputDialog("Digite o cpf");

                    System.out.println();
                break;

                case 4:
                    System.out.println("Atualiza Matricula do Aluno");
                    System.out.println();
                    String matriculaAlunoAtualizada = JOptionPane.showInputDialog("Digite a matricula");
                    System.out.println();

                break;

                case 5:
                    System.out.println("Realiza Atendimento Pedagogo");
                    System.out.println();
                    String nomeAlunoAtendimento = JOptionPane.showInputDialog("Digite o nome do aluno");
                    String nomePedagogoAtendimento = JOptionPane.showInputDialog("Digite o nome do pedagogo");
                    System.out.println();

                break;

                case 6:
                    System.out.println("Lista de Pessoas");

                    System.out.println();


                break;  

                case 7:
                    System.out.println("Relatório Alunos");

                    for(int i = 0; i < alunos.size(); i++ ){

                        alunos.get(i).toString();
                    }

                    System.out.println();
                break;

                case 8:
                    System.out.println("Relatório Professores");

                    for(int i = 0; i < professores.size(); i++ ){

                        professores.get(i).toString();
                    }

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
