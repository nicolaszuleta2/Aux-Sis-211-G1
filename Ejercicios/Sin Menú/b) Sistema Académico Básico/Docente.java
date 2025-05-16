public class Docente extends Usuario implements Registrable {
    private String especialidad;
    private static int totalDocentes = 0;

    public Docente(String nombre, String id, String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
        totalDocentes++;
    }

    @Override
    public void registrar() {
        System.out.println("Docente " + nombre + " registrado con ID " + id);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + ", ID: " + id + ", Especialidad: " + especialidad);
    }

    public static int getTotalDocentes() {
        return totalDocentes;
    }
}
