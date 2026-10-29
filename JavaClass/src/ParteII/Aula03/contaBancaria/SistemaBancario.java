package ParteII.Aula03.contaBancaria;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("--- BEM VINDO AO BANCO JAVA ---");

        System.out.println("Digite o nome do titular da conta: ");
        String nomeDigitado = ler.nextLine();

        System.out.println("Digite o valor do depósito inicial: ");
        double valorDigitado = ler.nextDouble();

        Conta minhaConta = new Conta(nomeDigitado, valorDigitado);
        System.out.println("\nConta criada com sucesso!!");
        minhaConta.mostrarSaldo();

        ler.close();
    }
}
