public class Veterinario extends Persona implements Registrable {
    private String especialidad;
    private static int totalVeterinarios = 0;

    public Veterinario(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
        totalVeterinarios++;
    }

    @Override
    public void registrar() {
        System.out.println("Veterinario registrado: " + nombre);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Veterinario: " + nombre + ", Especialidad: " + especialidad);
    }

    public static int getTotalVeterinarios() {
        return totalVeterinarios;
    }
}
