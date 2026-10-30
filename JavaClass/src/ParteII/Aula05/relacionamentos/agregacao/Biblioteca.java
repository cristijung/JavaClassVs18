package ParteII.Aula05.relacionamentos.agregacao;

import java.util.ArrayList;
import java.util.List;

// esta classe representa a Biblioteca que agrega múltiplos livros
// agregação é demonstrada pelo atributo livros, q é uma instância da classe Livro
public class Biblioteca {
    private String nome;
    private List<Livro> livros; // aqui há a AGREGAÇÃO - Biblioteca contém uma de livros

    public Biblioteca(String nome ) {
        this.nome = nome;
        this.livros = new ArrayList<>(); // inicializando a lista de livros
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void mostrarLivros() {
        System.out.println("Livros na biblioteca " + nome + ":");
        for (Livro livro : livros) {
            livro.mostrarDetalhes();
        }
    }

    public String getNome() {
        return  nome;
    }

}
