package ParteII.Aula05.relacionamentos.agregacao;

public class Main {
    public static void main(String[] args) {
        // criar as instâncias do Livro
        Livro livro1 = new Livro("1984", "Geoge Orwell");
        Livro livro2 = new Livro("Drácula", "Bram Stoker");
        Livro livro3 = new Livro("A Batalha das Ardenas", "Antony Beevor");

        // criar a insância da biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // add os livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // exibir
        biblioteca.mostrarLivros();
    }
}
