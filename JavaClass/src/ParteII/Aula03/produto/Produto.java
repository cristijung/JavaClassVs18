package ParteII.Aula03.produto;

public class Produto {

    // Parte II - Atributos
    // Variáveis que guardam o estado do objeto
    String nome;
    double preco;
    int quantidadeEstoque;

    // Parte II - Construtor
    // Metodo especial executado ao criar (instanciar) um novo objeto
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Parte III - Metodos --> Comportamentos

    // Metodo para exibir as informações do produto
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Em Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("-----------------------------");
    }

    // Metodo para adicionar itens ao estoque
    public void reporEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println("Estoque atualizado! Agora temos: " + this.quantidadeEstoque);
    }

    // Metodo que retorna um valor (cálculo do valor total em mercadoria)
    public double calcularValorTotalEstoque() {
        return this.preco * this.quantidadeEstoque;
    }
}