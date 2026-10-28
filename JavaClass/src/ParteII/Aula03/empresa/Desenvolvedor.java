package ParteII.Aula03.empresa;
// Classe Fila , subclasse
public class Desenvolvedor extends Funcionario{
    private double bonusPorProjetos;
    public Desenvolvedor(String nome, double salario, double bonusPorProjetos) {
        super(nome, salario);
        this.bonusPorProjetos = bonusPorProjetos;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalario() + this.bonusPorProjetos;
    }
}
