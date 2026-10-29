package ParteI.Aula02;

import java.util.Arrays;

public class ArraysExemplo {
    public static void main(String[] args) {
        //declarando e inicializando o Array
        int[] numeros = {5, 3, 8, 1, 9, 7};

        System.out.println("Array original: " + Arrays.toString(numeros)); //método q 'formata' a exibição do array como uma string
        System.out.println(numeros); //exibir o endereço da memória onde o Array está armazenado

        //ordenar o array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        //buscar um elemento dentro do Array
        int posicao = Arrays.binarySearch(numeros, 8);
        System.out.println("Posição do número 8: " + posicao);

        //preenchendo 1 array com 1 valor específico
        int[] arrayPreenchido = new int[8];
        Arrays.fill(arrayPreenchido, 102);
        System.out.println("Array preenchido com o valor 102: " + Arrays.toString(arrayPreenchido));

        //copiando arrays
        int[] copiaArray = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Cópia do Array: " + Arrays.toString(copiaArray));

        //comparando
        boolean iguais = Arrays.equals(numeros, copiaArray);
        System.out.println("Os Arrays são iguais? " + iguais);


    }
}
