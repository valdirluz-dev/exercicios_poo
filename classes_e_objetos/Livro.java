/*
* 9. Classe Livro (Utilizada para demonstrar a estrutura básica de classes)
* Atributos: titulo, autor, editora, isbn, numeroPaginas.
* Métodos: abrirLivro(), lerPagina(numero).
* */

public class Livro {
    String titulo;
    String autor;
    String editora;
    String isbn;
    int numeroPaginas;

    public Livro(String titulo, String autor, String editora, String isbn, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public void abrirLivro(){
        System.out.println("O livro foi aberto!");
    }

    public void lerPagina(int numero){
        System.out.println("Você leu a página " + numero);
        System.out.println("Paginas restantes: " + this.numeroPaginas - numero);
    }
}