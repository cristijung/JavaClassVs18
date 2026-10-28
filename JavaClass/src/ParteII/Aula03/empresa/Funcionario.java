package ParteII.Aula03.empresa;
// classe Mãe, Super Classe
public class Funcionario {
    // atributos privados
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos acessores (Getters) permitem a leitura dos atributos privados
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // métodos que será sobrescrito pelas classes filhas (subclasses) --> Polimorfismo
    public double calcularSalarioTotal() {
        return this.salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Final: R$ " + calcularSalarioTotal());
    }
}
