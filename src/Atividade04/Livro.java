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

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Ano: " + anoPublicacao;
    }

    public void exibirInformacoes() {
        System.out.println("---------------------------------");
        System.out.println(this.toString());
    }
}