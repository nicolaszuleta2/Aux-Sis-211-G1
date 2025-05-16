public class Mascota implements Registrable {
    private String nombre;
    private String especie;
    private int edad;
    private static int totalMascotas = 0;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        totalMascotas++;
    }

    @Override
    public void registrar() {
        System.out.println("Mascota registrada: " + nombre + " (" + especie + ")");
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " - Especie: " + especie + " - Edad: " + edad + " años");
    }

    public void mostrarInfo(String comentario) { // Sobrecarga
        System.out.println(comentario + ": " + nombre + " (" + especie + ")");
    }

    public static int getTotalMascotas() {
        return totalMascotas;
    }
}
