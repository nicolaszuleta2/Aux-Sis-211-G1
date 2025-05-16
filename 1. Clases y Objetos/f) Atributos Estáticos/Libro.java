public class Libro {
    private String titulo;
    private String autor;

    // Atributo estático: compartido entre todos los libros
    public static int totalLibros = 0;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        totalLibros++; // Se incrementa cada vez que se crea un libro
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    // Método estático para mostrar total de libros
    public static void mostrarTotalLibros() {
        System.out.println("Total de libros registrados: " + totalLibros);
    }
}
