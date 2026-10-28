package ParteI.Aula02;

import java.util.Locale;
import java.util.Scanner;

public class CadastroSimples {

    public static void main(String[] args) {
        // o .useLocale(Locale.US) para garantir que o ponto (.) funcione no salário
        // sem isso, em computadores brasileiros, ele exigiria vírgula (,) e ignoraria o import.
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== CADASTRO SIMPLIFICADO ===");

        // lendo texto
        System.out.print("Digite o nome completo: ");
        String nome = ler.nextLine();

        // lendo int
        System.out.print("Digite a idade: ");
        int idade = ler.nextInt();

        // lendo double
        System.out.print("Digite o salário (use ponto, ex: 3500.50): ");
        double salario = ler.nextDouble();

        // limpar buffer
        ler.nextLine();

        System.out.print("Digite o cargo desejado: ");
        String cargo = ler.nextLine();

        // saída
        System.out.println("\n--- DADOS RECEBIDOS ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);

        // boa prática: fechar o scanner manualmente no final
        ler.close();
    }
}
