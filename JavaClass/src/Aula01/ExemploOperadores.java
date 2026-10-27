package Aula01;
import java.util.Scanner;

public class ExemploOperadores {
    public static void main(String[] args) {

        int a = 10;
        int i = a++;
        int j = ++a;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de j: " + j);

        // int a = 10 --> a começa com 10
        // int i = a++ --> pós-incremento --> O i guardar o vlr atual (10). logo depois é incrementado  em 1 e passa a ser 11
        // int j = ++a --> p´re incremento --> antes de atribuir a j, O 'a' é incrementando em 1 passando de 11 para 12

        System.out.println("---------------------------------------");

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();

        String status = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Qual a idade? " + idade + " anos");
        System.out.println("Classificação de idade: " + status);
    }
}
