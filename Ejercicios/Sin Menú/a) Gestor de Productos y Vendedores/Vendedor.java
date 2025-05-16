public class Vendedor extends Persona implements Registrable {
    private String zona;
    private static int totalVendedores = 0;

    public Vendedor(String nombre, int edad, String zona) {
        super(nombre, edad);
        this.zona = zona;
        totalVendedores++;
    }

    public static int getTotalVendedores() {
        return totalVendedores;
    }

    @Override
    public void registrar() {
        System.out.println(nombre + " ha sido registrado como vendedor.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vendedor: " + nombre + ", Edad: " + edad + ", Zona: " + zona);
    }
}
