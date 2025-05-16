public class Alumno extends Usuario implements Registrable, Calificable {
    private double nota;
    private static int totalAlumnos = 0;

    public Alumno(String nombre, String id) {
        super(nombre, id);
        totalAlumnos++;
    }

    @Override
    public void registrar() {
        System.out.println("Alumno " + nombre + " registrado con ID " + id);
    }

    @Override
    public void asignarNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + ", ID: " + id + ", Nota: " + nota);
    }

    public static int getTotalAlumnos() {
        return totalAlumnos;
    }
}
