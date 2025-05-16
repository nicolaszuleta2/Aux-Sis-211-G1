public class Micro extends VehiculoPublico {
    public Micro(String placa, int capacidad) {
        super(placa, capacidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: Bus");
        super.mostrarInfo();
    }
}