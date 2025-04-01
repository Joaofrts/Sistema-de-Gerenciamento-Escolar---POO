##Lista de Exercícios
1) Implemente um sistema para gerenciamento das informações de uma escola. As
classes Aluno e Turma devem estar no pacote escola e deve ser implementada uma
aplicação para testar as outras classes que deve estar no pacote aplicacao.
Cada objeto da classe Aluno deve guardar os seguintes dados: matrícula, nome, 2
notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. setNota1 -> para inserir a nota da primeira avaliação.
b. setNota2 -> para inserir a nota da segunda avaliação.
c. setNotaTrabalho -> para inserir a nota do trabalho
d. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
tem peso 2)
A classe Turma deve conter os atributos disciplina, professor, carga horária,
quantidade de alunos e um vetor de 30 posições de objetos do tipo Aluno. Nesta
classe deve existir um método chamado insereAluno que instancia um objeto do tipo
Aluno e o insere no vetor de alunos da turma.
A aplicação de teste deve instanciar uma turma e oferecer um menu de opções para o
usuário com as opções:
• Inserir aluno
• Registrar nota 1
• Registrar nota 2
• Registrar nota do trabalho
• Calcular média da turma
• Mostrar listagem da turma
• Sair

Outros métodos serão necessários. Faz parte de sua atividade identificá-los.
