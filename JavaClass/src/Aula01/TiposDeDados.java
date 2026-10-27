package Aula01;

// classe com variáveis primitivas
public class TiposDeDados {
    // variáveis primitivas
    public byte varByte = 126; // 8 bits
    public byte varShort = (byte) 326578; // 16 bits
    public int varInteiro = 246;
    int varInt = 48;
    long varLong = 9569874236958172L; // do tipo long --> L no final p avisar ao compilador q é um num grande
    float varFloat = 3.56f; // do tipo float - precisão simples --> 32 bits (6 a 7 casas decimais)
    double varDouble = 2.88F; // precisão dupla mais segura --> 64 bits (15 a 16 casas decimais)
    char varChar = 'A'; // --> armazena somente um  caracter
    boolean varBoolean = true; // ou false
    int numero = 42; // armazena o valor real e é mais leve e não possui métodos especiais

    // variáveis/atributos de referência
    Integer numeros = 42; // classe --> armazena um objeto completo e é mais pesado e possui métodos específicos
    String varString = "Olá Ana Banana!"; // classe --> armazena uma sequência de caracteres e possui métodos específicos

public void exibirValores() {
    System.out.println("Variável byte: " + varByte);
    System.out.println("Variável short: " + varShort);
    System.out.println("Variável int: " + varInt);
    System.out.println("Variável/Classe String: " + varString);
}

    public static void main(String[] args) {
        TiposDeDados objeto = new TiposDeDados(); // criando o objeto
        objeto.exibirValores();
    }
}
