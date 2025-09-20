public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Yaris", 2019, 4);
        Carro carro2 = new Carro("Chevrolet","Classic", 2011, 4);
        Moto moto1 = new Moto("Yamaha", "MT-03", 2025, 1.0);
        Moto moto2 = new Moto("Kawasaki", "Z-400", 2024, 1.5);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        moto1.exibirDetalhes();
        moto2.exibirDetalhes();
    }
}
