package ParteI.Aula02;


public class ClassificadorDeNotas {

    // Método estático que recebe um caractere (conceito) e retorna uma String com a avaliação
    public static String avaliarNota(char conceito) {

        // o "switch expression" avalia a variável 'conceito'
        // A partir do Java 14, podemos usar a sintaxe de seta (->) como expressão
        return switch (conceito) {
            // Agrupa os casos 'A' maiúsculo e 'a' minúsculo no mesmo bloco de código
            case 'A', 'a' -> "Excelente! Aprovado com louvor.";

            // Caso seja 'B' ou 'b', retorna esta mensagem
            case 'B', 'b' -> "Muito bom! Aprovado.";

            // Caso seja 'C' ou 'c'
            case 'C', 'c' -> "Bom. Aprovado.";

            // Caso seja 'D' ou 'd'
            case 'D', 'd' -> "Regular. Precisa estudar mais.";

            // Caso seja 'F' ou 'f'
            case 'F', 'f' -> "Reprovado.";

            // O 'default' funciona como um "caso contrário" (equivalente ao 'else')
            // É obrigatório para cobrir qualquer valor que não se encaixe nos cases acima
            default -> "Conceito inválido.";
        }; // O ponto e vírgula aqui é necessário porque o switch é uma expressão que retorna um valor
    }

    // Método principal (ponto de entrada da aplicação Java)
    public static void main(String[] args) {
        // Declara e inicializa uma variável do tipo char com o valor 'B'
        char notaDoAluno = 'B';

        // Chama o método 'avaliarNota' passando a nota e guarda o resultado na variável 'resultado'
        String resultado = avaliarNota(notaDoAluno);

        // Imprime no console o conceito informado e o resultado avaliado
        System.out.println("Conceito informado: " + notaDoAluno);
        System.out.println("Resultado: " + resultado);
    }
}
