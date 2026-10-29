package ParteII.Aula04.sobrecargas.construtor;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private String categoria;

    // construtor 1 - padrão - sem argumentos
    public Produto() {
        this.nome = "Produto sem nome";
        this.preco = 0.0;
        this.estoque = 0;
        this.categoria = "Geral";
    }

    // construtor 2 - com parâmetros
    // utilizado p um cadastro rápido onde já temos um estoque definido e uma categoria
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 1; // estoque inicial padrão
        this.categoria = "Geral";
    }

    // metodo apenas p exibir os dados
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Total em estoque: " + estoque + " | Categoria: " + categoria);
    }

    // construtor 3 com todos os parâmetros
    public Produto(String nome, double preco, int estoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }
}
