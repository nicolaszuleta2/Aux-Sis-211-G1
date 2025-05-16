// Subclase
public class Gerente extends Colaborador implements Bonificable {
    private double bonoExtra;

    public Gerente(String nombre, int id, double salarioBase, double bonoExtra) {
        super(nombre, id, salarioBase);
        this.bonoExtra = bonoExtra;
    }

    @Override
    public double calcularBono() {
        return bonoExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBono();
    }
}