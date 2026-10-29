package ParteII.Aula04.ecommerce;
// herança + múltiplas interfaces
public class ProdutoFisico extends Produto implements Tributavel, Promocional {

    private double taxaFreteFixo;
    private double descontoCupom; // Atributo específico para a interface Promocional

    public ProdutoFisico(String codigoSku, String nome, double precoCusto, double taxaFreteFixo) {
        super(codigoSku, nome, precoCusto);
        this.taxaFreteFixo = taxaFreteFixo;
        this.descontoCupom = 0.0;
    }

    // Implementação da interface Tributavel (imposto de 10% sobre o custo)
    @Override
    public double calcularImposto() {
        return this.precoCusto * 0.10;
    }

    // Implementação da interface Promocional
    @Override
    public void aplicarCupom(String codigoCupom) {
        if (codigoCupom.equals("DESCONTO10")) {
            this.descontoCupom = 10.0;
            System.out.println("Cupom " + codigoCupom + " aplicado com sucesso no produto físico!");
        } else {
            System.out.println("Cupom inválido.");
        }
    }

    @Override
    public double getValorDescontoCupom() {
        return this.descontoCupom;
    }

    // Polimorfismo: cálculo final considerando custo, frete, imposto e desconto de cupom
    @Override
    public double calcularPrecoFinal() {
        return (this.precoCusto + this.taxaFreteFixo + calcularImposto()) - this.descontoCupom;
    }
}
