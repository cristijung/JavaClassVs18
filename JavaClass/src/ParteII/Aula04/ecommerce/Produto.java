package ParteII.Aula04.ecommerce;
// classe abstrata:
// Uma classe abstrata serve como um molde incompleto e
// genérico que não pode ser instanciado diretamente, destinando-se
// exclusivamente a ser herdada por outras classes que implementarão os seus detalhes.
public abstract class Produto {

    // Atributos privados (encapsulamento estrito)
    private String codigoSku;
    private String nome;

    // Atributo protegido (visível nas classes filhas)
    protected double precoCusto;

    // Construtor
    public Produto(String codigoSku, String nome, double precoCusto) {
        this.codigoSku = codigoSku;
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    public String getCodigoSku() {
        return codigoSku;
    }

    public String getNome() {
        return nome;
    }

    // Metodo abstrato obrigatório para as filhas
    // Um metodo abstrato é um metodo que possui apenas a assinatura (sem corpo ou chaves {}),
    // servindo como uma obrigação para que as classes filhas o implementem com o seu próprio comportamento.
    public abstract double calcularPrecoFinal();

    // Método comum para exibir os detalhes
    public void exibirDetalhes() {
        System.out.println("----------------------------------------");
        System.out.println("SKU: " + codigoSku);
        System.out.println("Produto: " + nome);
        System.out.println("Preço de Custo: R$ " + precoCusto);
        System.out.println("Preço Final de Venda: R$ " + calcularPrecoFinal());
    }
}
