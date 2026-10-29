package ParteI.Aula01;

//exemplo de notas
public class ArrayForEach {
    public static void main(String[] args) {
        //criando um array
        double[] notas = { 9.5, 7.0, 8.5, 6.2 };
        double soma = 0;

        System.out.println("---- Notas do Aluno ----");
        //for-each: para cada nota dentro de array notas
        //para cada nota de notas
        for (double nota : notas) {
            System.out.println("Nota registrada: " + nota);
            //soma a nota atual ao total
            soma += nota;
        }

        //calculo media fora do loop
        double media = soma / notas.length; //.lenght nos retorna o tamanho total do array

        System.out.println("---------------------------");
        System.out.println("Soma total: " + soma);
        System.out.println("Média final: " + media);

    }
}
