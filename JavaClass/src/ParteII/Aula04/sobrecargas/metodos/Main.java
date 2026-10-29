package ParteII.Aula04.sobrecargas.metodos;

public class Main {
    public static void main(String[] args) {
        //ex de uso da classe Biblioteca com sobrecarga de métodos
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua Principal, 123");
        biblioteca.exibirInformacoes();
        biblioteca.adicionarLivro("Java: Como Programar");
        biblioteca.adicionarLivro("Java: Como Programar", "Deitel & Deitel");
        biblioteca.adicionarLivro("Java: Como Programar", "Deitel & Deitel", 2020);

        System.out.println();

        //ex de uso da classe Livro com sobrecarga de construtores
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Padrões de Projeto");
        Livro livro3 = new Livro("Padrões de Projeto", "Erich Gamma");
        Livro livro4 = new Livro("Padrões de Projeto", "Erich Gamma", 1994);

        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
        System.out.println();
        livro3.exibirInformacoes();
        System.out.println();
        livro4.exibirInformacoes();
    }
}

