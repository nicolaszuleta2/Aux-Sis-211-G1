public class Estudiante {
    // Atributos encapsulados (private)
    private String nombre;
    private int edad;
    private String matricula;

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }

    // Getter para matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para mostrar la información del Estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
    }
}
