package Aula02;

import java.util.ArrayList;

public class GerenciadorNumerico {
    public static void main(String[] args) {
        // criando um ArrayList numérico de Integers
        ArrayList<Integer> numeros = new ArrayList<>();

        // 1 --> ADD VALORES --> .add
        // os elementos vão entrando sequencialmente e ocupando índices a partir do 0.
        numeros.add(10); // índice 0
        numeros.add(20); // índice 1
        numeros.add(30); // índice 2
        numeros.add(20); // índice 3 --> valor duplicado de propósito

        System.out.println("Lista inicial: " + numeros);

        // 2 --> REMOVENDO PELO ÍNDICE --> .remove(int index)
        // passando um número puro, o Java entende que é a POSIÇÃO (índice).
        // Aqui vamos remover o elemento que está no índice 0 (o número 10).
        numeros.remove(0);
        System.out.println("Após remover o item do índice 0: " + numeros);

        // 3 --> REMOVE COM NÚMEROS --> valor vs. índice
        // Se fizéssemos 'numeros.remove(20);', o Java acharia que queremos
        // remover o item do "índice 20" --> o que daria erro se a lista for menor.
        // Para remover o VALOR 20 em si, usamos 'Integer.valueOf(20)':
        numeros.remove(Integer.valueOf(20));
        System.out.println("Após remover o VALOR 20 (primeira ocorrência): " + numeros);

        // 4 --> ADD EM UM ÍNDICE ESPECÍFICO --> .add(index, elemento)
        // Podemos inserir um número numa posição exata, empurrando os outros para a frente.
        // Aqui colocamos o número 99 exatamente no índice 1.
        numeros.add(1, 99);
        System.out.println("Após inserir o 99 no índice 1: " + numeros);

        // 5 --> PERCORRENDO E MOSTRANDO A RELAÇÃO DE CADA VALOR COM O SEU ÍNDICE
        System.out.println("\n--- Relatório Final (Índice x Valor) ---");
        for (int i = 0; i < numeros.size(); i++) {
            int valorAtual = numeros.get(i); // .get(i) pega o valor guardado no índice i
            System.out.println("No Índice [" + i + "] está o valor: " + valorAtual);
        }
    }
}