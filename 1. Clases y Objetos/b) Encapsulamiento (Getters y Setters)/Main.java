/*
Encapsulamiento significa ocultar los atributos de la clase (haciéndolos private) 
y controlar el acceso a ellos mediante métodos públicos (get y set). Esto mejora 
la seguridad y el control sobre los datos.
*/

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        // Cambiar atributos del Estudiante por métodos set (Recomendable)
        estudiante1.setNombre("Carlos Pérez");
        estudiante1.setEdad(20);
        estudiante1.setMatricula("2025-001");

        // Mostrar la información del Estudiante (También se puede hacer por métodos get)
        estudiante1.mostrarInfo();

        // Intentar introducir una edad inválida
        estudiante1.setEdad(-5); // Mostrará: Edad no válida
    }
}
