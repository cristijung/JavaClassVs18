package ParteII.Aula03.empresa;
// Classe Fila , subclasse
public class Gerente extends Funcionario{
    private double participacaoDeLucros;

    public Gerente(String nome, double salario, double participacaoDeLucros) {
        super(nome, salario);
        this.participacaoDeLucros = participacaoDeLucros;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalario() + this.participacaoDeLucros;
    }
}
