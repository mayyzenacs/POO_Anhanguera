public class Carro extends Veiculo {
    private int numerPortas;

    public Carro(String marca, String modelo, int ano, int numerPortas) {
        super(marca, modelo, ano);
        this.numerPortas = numerPortas;

    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número Portas: " + this.numerPortas);
    }
}