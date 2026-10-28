package ParteII.Aula03.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor("Ana", 8000.00, 2300.00);
        Funcionario dev2 = new Desenvolvedor("Pafúncio", 8000.00, 200.00);
        Funcionario gestor = new Gerente("Mafaldo", 5000.00, 3500.00);

        System.out.println(" --- Dados do Desenvolvedor(a) --- ");
        dev.exibirInformacoes();
        dev2.exibirInformacoes();

        System.out.println(" #################################### ");
        System.out.println(" --- Dados do Gestor(a) --- ");
        gestor.exibirInformacoes();
    }
}
