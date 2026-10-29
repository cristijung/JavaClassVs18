package ParteII.Aula04.sobrecargas.construtor;

public class Main {
    public static void main(String[] args) {
        // chamando o construtor 1
        Produto p1 = new Produto();
        p1.exibirDetalhes();

        Produto p2 = new Produto("Mouse Gamer", 150.00);
        p2.exibirDetalhes();

        Produto p3 = new Produto("Teclado mecânico", 189.99, 25, "Periféricos");
        p3.exibirDetalhes();
    }
}
