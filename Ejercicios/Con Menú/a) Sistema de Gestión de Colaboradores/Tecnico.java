// Subclase
public class Tecnico extends Colaborador implements Bonificable {
    private int proyectos;

    public Tecnico(String nombre, int id, double salarioBase, int proyectos) {
        super(nombre, id, salarioBase);
        this.proyectos = proyectos;
    }

    @Override
    public double calcularBono() {
        return proyectos * 50;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBono();
    }
}