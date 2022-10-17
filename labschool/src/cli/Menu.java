package cli;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Pedagogo;
import model.Pessoa;
import model.Professor;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
Integer opcao;
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Pedagogo> pedagogos = new ArrayList<Pedagogo>();
        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("Menu \n 1 - Cadastrar Aluno \n 2 - Alterar Matricula Aluno \n 3 - Cadastrar Professor \n 4 - Cadastrar Pedagogo \n 5 - Realizar atendimento \n 6 - Listar Pessoas \n 7 - Relatório Aluno \n 8 - Relatório Professor \n 9 - Relatório alunos com mais atendimentos pedagógicos  \n 10 - Relatório pedagogos com mais atendimentos pedagógicos\n 0 - Sair" );
            System.out.println("Escolha uma opção");
           opcao = Integer.parseInt(scan.nextLine());
            switch(opcao){

                case 1:
                    System.out.println("Cadastro Aluno");

                    System.out.println(" Digite o nome do aluno");
                    String nomeAluno =scan.nextLine();
                    System.out.println("Digite o telefone do aluno");
                    String telefoneAluno = scan.nextLine();
                    System.out.println("Digite a data de nascimento do aluno");
                    String dataNascimentoAluno = scan.nextLine();
                    System.out.println("Digite o CPF do aluno");
                    String cpfAluno = scan.nextLine() ;
                    System.out.println("Escolhe uma opção para a matricula\n 1 - Ativa\n 2 - Irregular\n 3 - Atendimento pedagógico\n 4 - Inativo");
                    Integer opcaoAux =null;
                    String matriculaAluno=null;
                    do {

                        opcaoAux = Integer.parseInt(scan.nextLine());
                        switch (opcaoAux) {
                            case 1:
                             matriculaAluno = "Ativa";
                                opcaoAux =0;
                            break;
                            case 2:
                                 matriculaAluno = "Irregular";
                                opcaoAux =0;
                                 break;
                            case 3:
                                matriculaAluno = "Atendimento pedagógico";
                                opcaoAux =0;
                                break;
                            case 4:
                                matriculaAluno = "Inativa";
                                opcaoAux =0;
                                break;
                           default:
                               System.out.println("Escolha uma opção válida");
                               break;
                        }
                    }while(opcaoAux!=0);
                    System.out.println("Digite a nota do processo seletivo");
                    Double notaAluno = Double.parseDouble(scan.nextLine());

                    Aluno aluno = new Aluno(nomeAluno,telefoneAluno,dataNascimentoAluno,cpfAluno,matriculaAluno,notaAluno);

                    alunos.add(aluno);

                    System.out.println(alunos);

                break;

                case 2:
                    System.out.println("Digite o CPF do aluno:");
                    String cod = scan.nextLine();
                    alunos.forEach(aluno1 -> {if (aluno1.getCpf().equals(cod)){
                        System.out.println("Nome: "+aluno1.getNome());
                        System.out.println("Matricula atual: "+aluno1.getMatricula());
                        System.out.println("Escolhe uma opção para a matricula\n 1 - Ativa\n 2 - Irregular\n 3 - Atendimento pedagógico\n 4 - Inativo");
                        Integer opcaoMatricula1 =null;
                        String matriculaAluno1=null;
                        do {

                            opcaoMatricula1 = Integer.parseInt(scan.nextLine());
                            switch (opcaoMatricula1) {
                                case 1:
                                    matriculaAluno1 = "Ativa";
                                    opcaoMatricula1 =0;
                                    break;
                                case 2:
                                    matriculaAluno1 = "Irregular";
                                    opcaoMatricula1 =0;
                                    break;
                                case 3:
                                    matriculaAluno1 = "Atendimento pedagógico";
                                    opcaoMatricula1 =0;
                                    break;
                                case 4:
                                    matriculaAluno1 = "Inativa";
                                    opcaoMatricula1 =0;
                                    break;
                                default:
                                    System.out.println("Escolha uma opção válida");
                                    break;
                            }
                        }while(opcaoMatricula1!=0);
                    }else{
                        System.out.println("CPF inválido");
                    }
                    });
                    break;
                case 3:
                    System.out.println("Cadastro Professor");
                    System.out.println(" Digite o nome do professor");
                    String nomeProfessor =scan.nextLine();
                    System.out.println("Digite o telefone do professor");
                    String telefoneProfessor = scan.nextLine();
                    System.out.println("Digite a data de nascimento do professor");
                    String dataNascimentoProfessor = scan.nextLine();
                    System.out.println("Digite o CPF do professor");
                    String cpfProfessor = scan.nextLine() ;
                    System.out.println("Escolha a formação acadêmica \n 1 - Graduação incompleta \n 2 - Graduação completa \n 3 - Mestrado \n 4 - Doutorado");
                     opcaoAux =null;
                    String formacaoProfessor=null;
                    do {

                        opcaoAux = Integer.parseInt(scan.nextLine());
                        switch (opcaoAux) {
                            case 1:
                                formacaoProfessor = "Graduação incompleta ";
                                opcaoAux =0;
                                break;
                            case 2:
                                formacaoProfessor = "Graduação completa";
                                opcaoAux =0;
                                break;
                            case 3:
                                formacaoProfessor = "Mestrado";
                                opcaoAux =0;
                                break;
                            case 4:
                                formacaoProfessor = "Doutorado";
                                opcaoAux =0;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                                break;
                        }
                    }while(opcaoAux!=0);
                    System.out.println("Escolha a experiência em desenvolvimento \n 1 - Front-End \n 2 - Back-End \n 3 - Full-Stack \n ");
                    opcaoAux =null;
                    String experienciaProfessor = null;
                    do {

                        opcaoAux = Integer.parseInt(scan.nextLine());
                        switch (opcaoAux) {
                            case 1:
                                experienciaProfessor = "Front-End ";
                                opcaoAux =0;
                                break;
                            case 2:
                                experienciaProfessor = "Back-End";
                                opcaoAux =0;
                                break;
                            case 3:
                                experienciaProfessor = "Full-Stack";
                                opcaoAux =0;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                                break;
                        }
                    }while(opcaoAux!=0);
                    System.out.println("Escolha o estado do professor \n 1 - Ativo \n 2 - Inativo ");
                    opcaoAux =null;
                    boolean estadoProfessor = true;
                    do {

                        opcaoAux = Integer.parseInt(scan.nextLine());
                        switch (opcaoAux) {
                            case 1:
                                estadoProfessor=true;
                                opcaoAux =0;
                                break;
                            case 2:
                                estadoProfessor=false;
                                opcaoAux =0;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                                break;
                        }
                    }while(opcaoAux!=0);

                    Professor professor = new Professor(nomeProfessor,telefoneProfessor,dataNascimentoProfessor,cpfProfessor,experienciaProfessor,formacaoProfessor,estadoProfessor);
                    professores.add(professor);
                    System.out.println(professores);
                    break;
                case 4:
                    System.out.println("Cadastro Pedagogo");
                    System.out.println(" Digite o nome do Pedagogo");
                    String nomePedagogo =scan.nextLine();
                    System.out.println("Digite o telefone do Pedagogo");
                    String telefonePedagogo = scan.nextLine();
                    System.out.println("Digite a data de nascimento do Pedagogo");
                    String dataNascimentoPedagogo = scan.nextLine();
                    System.out.println("Digite o CPF do Pedagogo");
                    String cpfPedagogo = scan.nextLine() ;
                    Pedagogo pedagogo = new Pedagogo(nomePedagogo,telefonePedagogo,dataNascimentoPedagogo,cpfPedagogo);
                    pedagogos.add(pedagogo);
                    System.out.println(pedagogos);
                    break;

                case 5:
                    System.out.println("Realizar um atendimento Pedagógico");
                    System.out.println("Informe o CPF do pedagogo");
                    String codPedagogo = scan.nextLine();
                    System.out.println("Informe o CPF do aluno");
                    String codAluno = scan.nextLine();

                    pedagogos.forEach(pedagogo1 -> {
                        if (pedagogo1.getCpf().equals(codPedagogo)){
                            alunos.forEach(aluno1 -> {
                                if (aluno1.getCpf().equals(codAluno)){
                                    pedagogo1.setTotalAtendimentoPedagogo(pedagogo1.getTotalAtendimentoPedagogo()+1);
                                    aluno1.setTotalAtendimentoAluno(aluno1.getTotalAtendimentoAluno()+1);
                                }else {
                                    System.out.println("CPF aluno inválido");
                                }
                            });
                        }else {
                            System.out.println("CPF pedagogo inválido");
                        }

                    });
                    System.out.println(pedagogos);
                    break;

                case 6:
                    System.out.println("Escolha qual a categoria que deseja listar \n 1 - Alunos \n 2 - Professores \n 3 - Pedagogos \n 4 - Todos");
                    Integer opcao3 = Integer.parseInt(scan.nextLine());
                    switch (opcao3){
                        case 1:
                            System.out.println(alunos);
                        break;
                            case 2:
                                System.out.println(professores);
                        break;
                                case 3:
                            System.out.println(pedagogos);
                            break;
                        case 4:
                            System.out.println(alunos);
                            System.out.println(professores);
                            System.out.println(pedagogos);
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 7:
                    System.out.println("Escolha qual a situação da matricula deseja listar \n 1 - Ativo \n 2 - Irregular \n 3 - Atendimento pedagógico \n 4 - Inativo \n 5 - Todos");
                    Integer opcao4 = Integer.parseInt(scan.nextLine());
                    switch (opcao4){
                        case 1:
                         alunos.forEach(aluno1 -> {
                             if (aluno1.getMatricula().equals("Ativa")) {
                                 System.out.println(aluno1);
                             }
                         });
                            break;
                        case 2:
                            alunos.forEach(aluno1 -> {
                                if (aluno1.getMatricula().equals("Irregular")) {
                                    System.out.println(aluno1);
                                }
                            });
                            break;
                        case 3:
                            alunos.forEach(aluno1 -> {
                                if (aluno1.getMatricula().equals("Atendimento pedagógico")) {
                                    System.out.println(aluno1);
                                }
                            });
                            break;
                        case 4:
                            alunos.forEach(aluno1 -> {
                                if (aluno1.getMatricula().equals("Inativa")) {
                                    System.out.println(aluno1);
                                }
                            });
                            break;
                        case 5:
                            alunos.forEach(System.out::println);
                            break;

                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 8:
                    System.out.println("Escolha qual a experiencia do professor deseja listar \n 1 - Front-End \n 2 - Back-End \n 3 - Full-Stack \n 4 - Todos");
                    Integer opcao5 = Integer.parseInt(scan.nextLine());
                    switch (opcao5){
                        case 1:
                            professores.forEach(professor1  -> {
                                if (professor1.getExperienciaDesenvolvimento().equals("Front-End")) {
                                    System.out.println(professor1);
                                }
                            });
                            break;
                        case 2:
                            professores.forEach(professor1  -> {
                                if (professor1.getExperienciaDesenvolvimento().equals("Back-End")) {
                                    System.out.println(professor1);
                                }
                            });
                            break;
                        case 3:
                            professores.forEach(professor1  -> {
                                if (professor1.getExperienciaDesenvolvimento().equals("Full-Stack")) {
                                    System.out.println(professor1);
                                }
                            });
                            break;

                        case 4:
                            alunos.forEach(System.out::println);
                            break;

                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 9:
                    alunos.sort(Comparator.comparing(Aluno::getTotalAtendimentoAluno));
                    System.out.println(alunos);
                    break;
                case 10:
                    pedagogos.sort(Comparator.comparing(Pedagogo::getTotalAtendimentoPedagogo));
                    System.out.println(pedagogos);
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção invalida");

                    break;

            }

        }while(opcao != 0);

    }

    
}
