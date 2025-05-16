public class Bus extends Vehiculo implements Registrable {
    private String ruta;
    private static int totalBuses = 0;

    public Bus(String placa, int capacidad, String ruta) {
        super(placa, capacidad);
        this.ruta = ruta;
        totalBuses++;
    }

    @Override
    public void registrar() {
        System.out.println("Bus con placa " + placa + " registrado en la ruta " + ruta);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Bus: Placa=" + placa + ", Capacidad=" + capacidad + ", Ruta=" + ruta);
    }

    public void mostrarInfo(String extra) { // Sobrecarga
        System.out.println(extra + " -> Placa: " + placa);
    }

    public static int getTotalBuses() {
        return totalBuses;
    }
}
