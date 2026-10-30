package ParteII.Aula05.relacionamentos.composicao;

public class Quarto {
    private String tipo;

    public Quarto(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarDetalhes() {
        System.out.println("Tipo de quarto: " + tipo);
    }
}
