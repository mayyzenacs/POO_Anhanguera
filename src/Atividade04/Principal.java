package Atividade04;

public class Principal {
    public static void main(String[] args) {
        // sera necessario criar listas separadas com cada, pois não estarei utilizando arrays multidimensional
        String[] titulo = {
                "Introdução a Java",
                "Algoritmos e Bananas",
                "Java para Programadores",
                "Introdução a Arquitetura",
                "CI/CD em Java"
        };
        String[] autor = {
                "Junior Lutes",
                "Jovem Programador",
                "Carlos Ancelloti",
                "Ana Sobral",
                "Lucas Ônibus"
        };
        int[] ano = {2019, 2021, 2014, 2024, 2022};

        Livro[] livros = new Livro[5];

        for (int i = 0; i < titulo.length; i++) {
            Livro estante = new Livro(titulo[i], autor[i], ano[i]);
            livros[i] = estante;
        }

        for (int i = 0; i < livros.length; i++) {
            Livro livroClasse = livros[i];

            if (livroClasse.titulo.contains("Java")) {
                livroClasse.exibirInformacoes();
            }
        }
    }
}
