public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnio() { return anio; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setAnio(int anio) { this.anio = anio; }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Año: " + anio;
    }
}
