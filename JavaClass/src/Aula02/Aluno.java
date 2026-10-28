package Aula02;

import java.util.Scanner;
public class Aluno {
    public String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}

class SistemaEscolar {
    public static void main(String[] args) {
        // 1 --> usando a classe scanner para ler os dados do teclado
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?  ");
        int quantidade = ler.nextInt(); // ler o teclado com classe instanciada Scanner --> 'ler'
        ler.nextLine(); // limpar o buffer do teclado

        // 2 --> criando um ARRAY p armazenar objetos do tipo Aluno
        Aluno[] listaAlunos = new Aluno[quantidade];

        // 3 --> preenchendo o array com dados informados pelo user
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\n -- Digite os dados do " + (i + 1) + " aluno ---");

            System.out.println("Nome: ");
            String nome = ler.nextLine();

            System.out.println("Idade: ");
            int idade = ler.nextInt();

            System.out.println("Nota: ");
            double nota = ler.nextDouble();

            // 3.1 --> criando o objeto usando o CONSTRUTOR e guardando na posição do array
            listaAlunos[i] = new Aluno(nome, idade, nota);
        }

        // exibir o relatório final
        System.out.printf("\n==========================");
        System.out.printf(" Relatório de Alunos ");
        System.out.printf("\n==========================");

        // percorrendo o array de alunos
        for (int i = 0; i < listaAlunos.length; i++) {
            Aluno a = listaAlunos[i]; // está pegando o objeto atual do array

            System.out.println("Nome: " + a.nome);
            System.out.println("Idade: " + a.idade + " anos") ;
            System.out.println("Nota: " + a.nota);

            // 3.2 Condicionais --> if, else if, else
            if (a.nota >= 7.0) {
                System.out.println("Situação: APROVADO(A)");
            } else if (a.nota >= 5.0) {
                System.out.println("Situação: RECUPERAÇÃO");
            } else {
                System.out.println("Situação: REPROVADO(A)");
            }
            System.out.println("---------------------------------------");
        }
        ler.close();
    }
}
