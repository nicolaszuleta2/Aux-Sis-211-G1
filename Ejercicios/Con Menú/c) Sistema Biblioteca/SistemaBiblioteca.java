import java.util.*;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Libro> libros = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE LIBROS ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Ver lista de libros");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    libros.add(new Libro(titulo, autor, anio));
                    System.out.println("Libro registrado.");
                    break;

                case 2:
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println((i + 1) + ". " + libros.get(i));
                        }
                    }
                    break;

                case 3:
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros para actualizar.");
                        break;
                    }
                    for (int i = 0; i < libros.size(); i++) {
                        System.out.println((i + 1) + ". " + libros.get(i).getTitulo());
                    }
                    System.out.print("Seleccione número del libro a actualizar: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    if (index >= 0 && index < libros.size()) {
                        Libro libro = libros.get(index);
                        System.out.print("Nuevo título: ");
                        libro.setTitulo(sc.nextLine());
                        System.out.print("Nuevo autor: ");
                        libro.setAutor(sc.nextLine());
                        System.out.print("Nuevo año: ");
                        libro.setAnio(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Libro actualizado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros para eliminar.");
                        break;
                    }
                    for (int i = 0; i < libros.size(); i++) {
                        System.out.println((i + 1) + ". " + libros.get(i).getTitulo());
                    }
                    System.out.print("Seleccione número del libro a eliminar: ");
                    int idxEliminar = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idxEliminar >= 0 && idxEliminar < libros.size()) {
                        libros.remove(idxEliminar);
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}