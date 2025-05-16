public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor 1: con todos los datos
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Constructor 2: solo marca y modelo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 0; // Año desconocido
    }

    // Constructor 3: solo marca
    public Vehiculo(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
        this.anio = 0;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("---------------------");
    }
}
