package ParteII.Aula05.relacionamentos.composicao;

public class Casa {
    private Quarto quarto; // composição - uma Casa SEMPRE vai conter um quarto

    public Casa(String tipoQuarto) {
        this.quarto = new Quarto(tipoQuarto);
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes da casa: ");
        quarto.mostrarDetalhes(); // passando a chamada ao metodo da classe Quarto
    }
}
