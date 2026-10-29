package ParteI.Aula01;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("--- Parte I (--) Usando decremento ---");
        int bateria = 5;

        do {
            System.out.println("Bateria em: " + bateria + "%");
            bateria--; //pós-decremento q diminui 1 após esta linha ser executada
        } while (bateria > 0);

        System.out.println("Bateria do celular acabou");

        System.out.println("-----------------------------------");
        System.out.println("\n--- Parte II A diferença entre Pós x Pré  ---");

        //exe1 - pós incremento usando um contador (contador++)
        int contadorPos = 0;
        //NO do: daqui p baixo, neste exemplo o Java imprime o vlr ATUAL (0), só DEPOIS soma com o 1
        //na tela aparece o 0 (zero), mas na memória vira 1
        do {
            System.out.println("Valor impresso: " + contadorPos++);
        } while (contadorPos < 3);

        //exe2 - pré-incremento (++contador)
        int contadorPre = 0;
        System.out.println("\nTestando Pre (++contador:");

        //NO do: o Java soma 1 PRIMEIRO e imprime o NOVO valor
        //na memória vira 1 e na tela já aparece 1
        do {
            System.out.println("Valor impresso: " + ++contadorPre);
        } while (contadorPre < 3);
    }
}
