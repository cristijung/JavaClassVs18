package ParteII.Aula05.relacionamentos.associacao;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", "Prata");
        Pessoa pessoa1 = new Pessoa("Ana Banana", carro1); //criação do obj Pessoa com a associação a um carro (Carro)

        // exibir informações da pessoa e do carro
        pessoa1.exibirInformacoes();

        Pessoa pessoa2 = new Pessoa("Pafúncio", null);
        pessoa2.exibirInformacoes();
    }
}
