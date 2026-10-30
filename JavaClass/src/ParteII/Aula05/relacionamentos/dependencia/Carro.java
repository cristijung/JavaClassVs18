package ParteII.Aula05.relacionamentos.dependencia;

public class Carro {
    private final String modelo;
    private final String placa;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Carro " + modelo + " ligado.");
    }

    public void desligar() {
        System.out.println("Carro " + modelo + " desligado.");
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
