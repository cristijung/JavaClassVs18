package ParteI.Aula02;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        // --- criação e inserção inicial ---
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");     // índice 0
        frutas.add("Banana");   // índice 1
        frutas.add("Uva");      // índice 2
        frutas.add("Abacaxi");
        frutas.add("Melancia");
        frutas.add("Morango");

        System.out.println("1. Lista Original: " + frutas);

        // .add --> adicionando mais elementos
        frutas.add("Bergamota");
        frutas.add("Laranja");

        System.out.println("2. Após adicionar Bergamota e Laranja: " + frutas);

        // foreach
        System.out.println("\n--- Lista Um por Um ---");
        for (String fruta : frutas) { // para cada fruta em frutas
            System.out.println(fruta);
        }
        System.out.println("-----------------------\n");

        // .get --> acessando elemento
        // uva está no índice 2
        System.out.println("A fruta na posição 2 é: " + frutas.get(2));

        // .remove

        // remover pelo nome -- objeto
        frutas.remove("Banana");
        System.out.println("3. Após remover 'Banana': " + frutas);
        // agora "uva" desceu para o índice 1!

        // remover pelo Índice
        frutas.remove(0); // remove quem está no índice 0 (que era "Maçã")
        System.out.println("4. Após remover o índice 0 (Maçã): " + frutas);

        // .set --> substituir e/ou editar
        // removemos a Maçã e a Banana, a lista agora começa com "uva"
        // trocando "uva" (que agora é o índice 0) por "Mamão".
        frutas.set(0, "Mamão");

        System.out.println("5. Após trocar o índice 0 por 'Mamão': " + frutas);

        // verificando o tamanho final -->  .size
        System.out.println("Tamanho final da lista: " + frutas.size());
    }
}