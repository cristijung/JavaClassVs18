package ParteI.Aula02;

public class FilaBanco {
    // Declaração do Array
    // é o tipo seguido pelos []
    // um Array não guarda apenas 1 string e sim 1 lista
    public String[] clientes;

    // construtor da classe
    public FilaBanco(int capacidade) {
        // criando o Array na memória
        // estamos dizendo ao Java p reservar espaço na memória p guardar a quantidade de elementos informada
        clientes = new String[capacidade];
    }

    // método p exibir os dados do array
    public void exibirFila() {
        System.out.println(" *** Fila de Espera de Clientes *** ");

        // .length p saber o tamanho total (capacidade) do array
        for (int i = 0; i < clientes.length; i++) {
            // acessando o elemento do array
            System.out.printf((i+ 1) + "°lugar: " + clientes[i] + "\n");
        }
    }

    public static void main(String[] args) {
        // criando o objeto
        FilaBanco minhaFila = new FilaBanco(5);

        // atribuindo valores p o array
        minhaFila.clientes[0] = "Ana Banana";
        minhaFila.clientes[1] = "Pafúncio Silva";
        minhaFila.clientes[2] = "Mafalda Souza";
        minhaFila.clientes[3] = "Maísa Algo";
        minhaFila.clientes[4] = "Audrey Hepburn";

        minhaFila.exibirFila();
    }
}
