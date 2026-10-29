package ParteI.Aula01;

public class ExemploFor {
    public static void main(String[] args) {
        int tabuada = 8;
        System.out.println("Gerando a tabuada do " + tabuada + ":");

        //o for
        for (int i = 1; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + "x" + i + " = " + resultado);
        }
        System.out.println("Fim da tabuada");
    }
}
