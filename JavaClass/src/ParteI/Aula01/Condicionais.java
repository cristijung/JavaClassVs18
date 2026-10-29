package ParteI.Aula01;

public class Condicionais {
    //método1
    public void exemploIfElse(int a) {
        if (a > 15) {
            System.out.println("a é maior do que 15");
        } else {
            System.out.println("a não é maior do que 15");
        }
    }

    //método2
    public void outroExemploIfElse(int a) {
        if (a > 15) {
            System.out.println("a é maior do que 15");
        } else if (a > 5) {
            System.out.println("a é maior que 5, mas não é maior do que 15");
        } else {
            System.out.println("a não é maior do que 15");
        }
    }

    public static void main(String[] args) {
        Condicionais cond = new Condicionais(); //criando um objeto da classe Condicionais
        int valor1 = 20;
        int valor2 = 10;
        int valor3 = 6;

        //chamar os métodos criados com o valor1
        System.out.println("Testando exemplo de IfElse com a = " + valor1 + ": ");
        cond.exemploIfElse(valor1); //chamando método

        System.out.println("--------------------------------");

        System.out.println("Testando outro exemplo de IfElse com a = " + valor2 + ": ");
        System.out.println("Testando outro exemplo de IfElse com a = " + valor3 + ": ");
        cond.outroExemploIfElse(valor2);
        cond.outroExemploIfElse(valor3); //chamando método

    }
}
