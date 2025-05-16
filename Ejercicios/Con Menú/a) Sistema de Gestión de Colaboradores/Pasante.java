// Subclase
public class Pasante extends Colaborador {
    public Pasante(String nombre, int id) {
        super(nombre, id, 500);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}