public class Moto extends Veiculo {
    private double cilindradas;

    public Moto(String marca, String modelo, int ano, double cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}