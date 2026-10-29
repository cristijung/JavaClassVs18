package ParteII.Aula04.sobrecargas.metodos;

public class Biblioteca {
    private String nome;
    private String endereco;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    //sobrecarga de métodos para adicionar livros
    public void adicionarLivro(String titulo) {
        System.out.println("Livro adicionado: " + titulo);
    }

    public void adicionarLivro(String titulo, String autor) {
        System.out.println("Livro adicionado: " + titulo + " por " + autor);
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        System.out.println("Livro adicionado: " + titulo + " por " + autor + " (Ano: " + ano + ")");
    }

    //métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Biblioteca: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}

