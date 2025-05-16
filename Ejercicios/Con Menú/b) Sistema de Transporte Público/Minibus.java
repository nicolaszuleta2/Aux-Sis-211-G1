public class Minibus extends VehiculoPublico {
    public Minibus(String placa, int capacidad) {
        super(placa, capacidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: Minibús");
        super.mostrarInfo();
    }
}