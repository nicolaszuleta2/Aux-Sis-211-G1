public class Main {
    public static void main(String[] args) {
        // Crear conductores
        Conductor c1 = new Conductor("Juan Pérez", "X12345");
        Conductor c2 = new Conductor("Ana Díaz", "Y67890");

        // Crear buses
        Bus b1 = new Bus("ABC-123", 40, "Ruta 1");
        Bus b2 = new Bus("XYZ-789", 50, "Ruta 5");

        // Polimorfismo con interfaz Registrable
        Registrable[] registros = { c1, c2, b1, b2 };

        for (Registrable r : registros) {
            r.registrar();

            if (r instanceof Conductor) {
                ((Conductor)r).mostrarInfo();
            }

            if (r instanceof Bus) {
                ((Bus)r).mostrarInfo();
                ((Bus)r).mostrarInfo("Bus especial");
            }
        }

        System.out.println("Total de conductores: " + Conductor.getTotalConductores());
        System.out.println("Total de buses: " + Bus.getTotalBuses());
    }
}
