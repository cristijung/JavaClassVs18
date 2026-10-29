package ParteII.Aula03.produto;

public class ControleEstoque {
    public static void main(String[] args) {
        // Criando (Instanciando) um objeto do tipo Produto
        // Estamos criando um "Notebook Gamer" com preço 4500.00 e 10 unidades
        Produto p1 = new Produto("Notebook Gamer", 4500.00, 10);

        // Usando os métodos do objeto
        p1.exibirDetalhes();

        // Realizando uma ação: Repor estoque
        p1.reporEstoque(5); // Agora deve ter 15

        // Recebendo um valor de volta
        double valorTotal = p1.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: R$ " + valorTotal);
    }
}
