package ParteI.Aula01;

public class ExWhile {
    public static void main(String[] args) {
        int  contador = 10;
        System.out.println("Iniciando um loop com While: ");

        while (contador < 10) {
            System.out.println("Após o loop while - Contador: " + contador);
            contador++;
        }
        System.out.println("Após o loop while - Contador Final: " + contador);

        contador = 0;
        System.out.println("\nIniciando outro loop while: ");
        while (contador <= 5) {
            System.out.println("Dentro do while - Contador: " + contador);
            contador++;
        }
    }
}
