package escola;

public class Aluno {
    private Integer matricula;
    private String nome;
    private double nota1 = 0.0, nota2=0.0,notaTrabalho=0.0;



    public Aluno() {
    }
    
    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.notaTrabalho = 0.0;
    }

    public Integer getMatricula() {
        return matricula;
    }
  

    public String getNome() {
        return nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double media(){        
        return (nota1*2.5 + nota2*2.5 + notaTrabalho * 2.0)/7.0 ;
    }

    public String toString(){
        return "Nome: "+nome+
               "      Matricula: "+matricula;
    }
    
    



    

    
}
