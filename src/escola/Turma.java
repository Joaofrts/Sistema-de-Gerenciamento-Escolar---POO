package escola;

import java.util.Scanner;

public class Turma {
    Scanner sc = new Scanner(System.in);

    private String disciplina, professor;
    private Integer cargaHoraria,qtdAlunos = 0, tamMaxTurma =30;
    private Aluno[] turma = new Aluno[tamMaxTurma];
    
    public Turma() {
    }

    public Turma(String disciplina, String professor, Integer cargaHoraria) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void inserirAluno(){
        if (qtdAlunos<tamMaxTurma) {
            System.out.print("Digite a matricula do aluno: ");
            int matricula = sc.nextInt();
            System.out.print("Digite o nome do Aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();
            turma[qtdAlunos]= new Aluno(matricula,nome);
            qtdAlunos++;
        }else{
            System.out.println("Não será possivel cadastra um novo aluno.");
            System.out.println("A turma esta cheia!");
        }
    }

    public boolean listarTurma(){
        if(existeAluno()){
            for(int i = 0; i<qtdAlunos;i++){
                System.out.println((i+1)+" - "+turma[i]);
            }
            return true;
        }else{
            System.out.println("Não existe alunos cadastrados.");
            System.out.println("\nCadastre um novo aluno!");
            return false;
        }
    }

    public String listarTurmaFinal(){
        if(existeAluno()){
            String alunos = "";
            for(int i = 0; i<qtdAlunos;i++){
                 alunos += (i+1)+" - "+turma[i]+"\n";
            }
            return alunos;
            
        }else{
            return "Não existe alunos cadastrados.\nCadastre um novo aluno!";
        }
    }

    public void registraNota1(int aluno, double nota1){

        System.out.println();
        turma[aluno-1].setNota1(nota1);
    }

    public void registraNota2(int aluno, double nota2){
        turma[aluno-1].setNota2(nota2);
    }

    public void registraNotaTrabalho(int aluno, double notaTrabalho){
        turma[aluno-1].setNotaTrabalho(notaTrabalho);
    }

    public double mediaTurma(){
        if(existeAluno()){
            double soma = 0;
            for(int i = 0;i<qtdAlunos;i++){
                soma += turma[i].media();
            }
            return soma/qtdAlunos;
        }else{
            return 0.0;
        }
    }



    private boolean existeAluno(){
        return qtdAlunos!=0 ? true : false;
    }

    public String toString(){
        return "Disciplina: " + disciplina 
                + "  Professor: " + professor
                + "   Carga Horária: " + cargaHoraria
                +"\n\n"+ listarTurmaFinal();
    }

    
}
