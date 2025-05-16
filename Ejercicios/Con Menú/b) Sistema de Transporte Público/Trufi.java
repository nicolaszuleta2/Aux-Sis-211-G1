public class Trufi extends VehiculoPublico {
    public Trufi(String placa, int capacidad) {
        super(placa, capacidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: Trufi");
        super.mostrarInfo();
    }
}