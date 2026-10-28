package Aula02;

// anatomia de uma classe java
public class PrimeiroExemploClasse {
    // declarando os atributos da classe
    String nome;
    String sobreNome;
    int idade;
    double altura;
    boolean generoFeminino;

    // construtor --> responsável por inicializar os atributos
    public PrimeiroExemploClasse(String nome, String sobreNome, int idade, double altura, boolean generoFeminino) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.altura = altura;
        this.generoFeminino = generoFeminino;
    }

    // método p exibir a ficha do aluno (ou da pessoa)
    public void exibirFicha() {
        System.out.println(" *** Ficha do Aluno *** ");
        System.out.println("Nome: " + nome + " " + sobreNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("É genero feminino? " + generoFeminino);

        // ex de operação corrigida
        int anoNascimento = 2026 - idade;
        System.out.printf("Ano de nascimento: " + anoNascimento);
    }

    public static void main(String[] args) {
        // criando o objeto --> instância da classe usando o construtor
        PrimeiroExemploClasse aluno1 = new PrimeiroExemploClasse("Ana", "Banana", 26, 1.75, true);
        PrimeiroExemploClasse aluno2 = new PrimeiroExemploClasse("Mafaldo Luiz", "Cortez", 26, 1.75, false);
        PrimeiroExemploClasse aluno3 = new PrimeiroExemploClasse("Pafúncio", "Silva", 26, 1.75, false);

        // chamando o método
        aluno1.exibirFicha();
        aluno2.exibirFicha();
        aluno3.exibirFicha();
    }
}
