package ParteII.Aula05.relacionamentos.dependencia;

public class Motorista {
    private String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }

    // criar metodo da classe Motorista que DEPENDE da classe Carro
    // é a dependência
    public void dirigir(Carro carro) {
        System.out.println(nome + " está dirigindo o carro " + carro.getModelo() + " com placa " + carro.getPlaca());
        carro.ligar();
        carro.desligar();
    }

    public String getNome() {
        return nome;
    }

}
