public abstract class Vehiculo {
    protected String placa;
    protected int capacidad;

    public Vehiculo(String placa, int capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public abstract void mostrarInfo();
}
