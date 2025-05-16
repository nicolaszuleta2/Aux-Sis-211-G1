public class Conductor implements Registrable {
    private String nombre;
    private String licencia;
    private static int totalConductores = 0;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        totalConductores++;
    }

    @Override
    public void registrar() {
        System.out.println("Conductor " + nombre + " registrado con licencia " + licencia);
    }

    public void mostrarInfo() {
        System.out.println("Conductor: " + nombre + ", Licencia: " + licencia);
    }

    public static int getTotalConductores() {
        return totalConductores;
    }
}
