package Exercicio02;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Tyson", "Mike Tyson", Categoria.AUTO_BIOGRAFIA, Status.DISPONIVEL);

        Livro livro2 = new Livro("It a coisa", "Stephen King", Categoria.TERROR, Status.EM_USO);

        Livro livro3 = new Livro("Bird box", "Josh Malerman", Categoria.SUSPENSE, Status.EMPRESTADO);

        Livro livro4 = new Livro("O Hobbit", "J. R. R. Tolkien",Categoria.FANTASIA, Status.DISPONIVEL);

        Livro livro5 = new Livro("O Guarda", "Kiera Cass",Categoria.ROMANCE, Status.DISPONIVEL);


        System.out.println(livro1.categoria + " - " + livro1.titulo + " ( " + livro1.autor + " ):  " + livro1.status);
        System.out.println(livro2.categoria + " - " + livro2.titulo + " ( " + livro2.autor + " ):  " + livro2.status);
        System.out.println(livro3.categoria + " - " + livro3.titulo + " ( " + livro3.autor + " ):  " + livro3.status);
        System.out.println(livro4.categoria + " - " + livro4.titulo + " ( " + livro4.autor + " ):  " + livro4.status);
        System.out.println(livro5.categoria + " - " + livro5.titulo + " ( " + livro5.autor + " ):  " + livro5.status);



    }
}
