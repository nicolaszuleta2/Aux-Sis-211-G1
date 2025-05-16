/*
Un atributo estático (static) pertenece a la clase, no a cada objeto.
Es compartido por todos los objetos de esa clase.
Se usa para contar, configurar o almacenar información común a todos.
Un atributo estático solo puede ser accedido desde un método estático.
*/

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("1984", "George Orwell");
        Libro l2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupéry");

        l1.mostrarInfo();
        System.out.println("-----------------");
        l2.mostrarInfo();
        System.out.println("-----------------");
        l3.mostrarInfo();
        System.out.println("-----------------");

        // Mostrar el total de libros usando el método estático
        Libro.mostrarTotalLibros();
    }
}
