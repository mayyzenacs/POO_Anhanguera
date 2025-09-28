package Atividade04;


import java.util.Arrays;

public class Principal extends Livro {
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
            String tituloLivro = titulo[i];
            String autorLivro = autor[i];
            int anoLivro = ano[i];

            Livro estante = new Livro(tituloLivro, autorLivro, anoLivro);
            livros[i] = estante;
        }

        for (int i = 0; i < livros.length; i++) {
            String livrosString =  livros[i].toString();
            System.out.println(livrosString);
            if (livrosString.contains("Java")) {
                System.out.println(livrosString);
            }
        }


    }
}
