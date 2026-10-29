package ParteII.Aula03.contaBancaria;

public class Conta {
    //Parte I
    //Atributos
    String titular;
    double saldo;

    //Parte II
    //Construtor
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //Parte III
    //Métodos
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Autual: R$ " + saldo);
    }
}
