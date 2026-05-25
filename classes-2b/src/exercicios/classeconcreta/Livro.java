package exercicios.classeconcreta;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
