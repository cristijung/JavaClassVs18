package ParteII.Aula04.ecommerce;
// herança + múltiplas interfaces
public class ProdutoDigital extends Produto implements Promocional {

    private double descontoPromocionalBase;
    private double descontoCupom;

    public ProdutoDigital(String codigoSku, String nome, double precoCusto, double descontoPromocionalBase) {
        super(codigoSku, nome, precoCusto);
        this.descontoPromocionalBase = descontoPromocionalBase;
        this.descontoCupom = 0.0;
    }

    @Override
    public void aplicarCupom(String codigoCupom) {
        if (codigoCupom.equals("PROMO5")) {
            this.descontoCupom = 5.0;
            System.out.println("Cupom " + codigoCupom + " aplicado no produto digital!");
        } else {
            System.out.println("Cupom inválido.");
        }
    }

    @Override
    public double getValorDescontoCupom() {
        return this.descontoCupom;
    }

    // Polimorfismo: cálculo final baseado no custo menos os descontos
    @Override
    public double calcularPrecoFinal() {
        return this.precoCusto - this.descontoPromocionalBase - this.descontoCupom;
    }
}
