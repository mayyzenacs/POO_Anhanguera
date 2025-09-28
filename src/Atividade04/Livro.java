package Atividade04;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro() {
    }

    public String exibirInformacoes() {
        return "titulo: " + titulo + "," + "Autor: " + autor + ", "+ "Ano de Publicação: " + anoPublicacao;
    }

}