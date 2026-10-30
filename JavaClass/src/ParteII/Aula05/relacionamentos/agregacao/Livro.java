package ParteII.Aula05.relacionamentos.agregacao;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " Autor: " + autor);
    }

}
