public class VehiculoPublico {
    private String placa;
    private int capacidad;
    private static int contadorVehiculos = 0;

    public VehiculoPublico(String placa, int capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
        contadorVehiculos++;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Capacidad: " + capacidad + " pasajeros");
    }
}
