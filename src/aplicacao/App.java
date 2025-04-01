package aplicacao;

import java.util.Scanner;

import escola.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int controlador = 0;

        System.out.print("Digite a disciplina: ");
        String disciplina =  sc.nextLine();
        System.out.print("Digite o nome do professor: ");
        String professor = sc.nextLine();
        System.out.print("Digite a carga horaria da disciplina: ");
        Integer cargaHoraria = sc.nextInt();
        Turma turma = new Turma(disciplina, professor, cargaHoraria);

        while (controlador!=7) {
            /**1 - Inserir aluno
             * 2 - Registrar nota 1
             * 3 - Registrar nota 2
             * 4 - Registrar nota do trabalho
             * 5 - Calcular média da turma
             * 6 - Mostrar listagem da turma
             * 7 - Sair
             */
            System.out.println( "\n             * 1 - Inserir aluno\r\n" + //
                                "             * 2 - Registrar nota 1\r\n" + //
                                "             * 3 - Registrar nota 2\r\n" + //
                                "             * 4 - Registrar nota do trabalho\r\n" + //
                                "             * 5 - Calcular média da turma\r\n" + //
                                "             * 6 - Mostrar listagem da turma\r\n" + //
                                "             * 7 - Sair\n");

            controlador = sc.nextInt(); 
            
            switch (controlador) {
                case 1:
                    turma.inserirAluno();
                    break;
                case 2:
                    if (turma.listarTurma()) {
                        System.out.print("Digite o numero do aluno: ");
                        int aluno = sc.nextInt();
                        System.out.print("Digite a primeira nota do aluno: ");
                        double nota1 = sc.nextDouble();
                        turma.registraNota1(aluno, nota1);
                } 
                    break;
                case 3: 
                    if (turma.listarTurma()) {
                        System.out.print("Digite o numero do aluno: ");
                        int aluno = sc.nextInt();
                        System.out.print("Digite a segunda nota do aluno: ");
                        double nota2 = sc.nextDouble();
                        turma.registraNota2(aluno, nota2);
                    }
                    break;
                case 4:
                    if (turma.listarTurma()) {
                        System.out.print("Digite o numero do aluno: ");
                        int aluno = sc.nextInt();
                        System.out.print("Digite a nota do trabalho do aluno: ");
                        double notaTrabalho = sc.nextDouble();
                        turma.registraNotaTrabalho(aluno, notaTrabalho);
                    }
                    break;
                case 5:
                    System.out.printf("Média da turma: %.2f",turma.mediaTurma());
                    break;
                case 6:
                    System.out.println(turma);
                case 7:
                    break;
                    
            
                default:
                    System.out.println("\nOpção Invalida! Tente novamente.\n\n");
                    break;
            }                    
        }
        sc.close();
    }
}
