package ParteII.Aula04.ecommerce;

public class LojaVirtual {
    public static void main(String[] args) {

        // Criando objetos usando o tipo polimórfico (Produto)
        ProdutoFisico livroFisico = new ProdutoFisico("SKU123", "Livro Clean Code", 80.0, 15.0);
        ProdutoDigital cursoDigital = new ProdutoDigital("SKU456", "Curso de Java Avançado", 200.0, 50.0);

        System.out.println("=== APLICANDO CUPONS DE DESCONTO ===");
        livroFisico.aplicarCupom("DESCONTO10");
        cursoDigital.aplicarCupom("PROMO5");

        // Array polimórfico de Produtos
        Produto[] carrinhoDeCompras = {livroFisico, cursoDigital};

        System.out.println("\n=== RESUMO DO CARRINHO E IMPOSTOS ===");
        for (Produto p : carrinhoDeCompras) {
            p.exibirDetalhes(); // Executa o preço final específico de cada um

            // Verificando de forma polimórfica se o produto implementa a interface Tributavel
            if (p instanceof Tributavel) {
                // Fazemos o "cast" para acessar o método exclusivo da interface
                Tributavel itemTributavel = (Tributavel) p;
                System.out.println("-> Imposto embutido: R$ " + itemTributavel.calcularImposto());
            }
            System.out.println("----------------------------------------");
        }
    }
}
