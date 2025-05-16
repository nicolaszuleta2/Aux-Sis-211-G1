// Clase abstracta
public abstract class Colaborador {
    private String nombre;
    private int id;
    protected double salarioBase;
    private static int contador = 0;

    public Colaborador(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        contador++;
    }

    public abstract double calcularSalario();

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Salario base: " + salarioBase);
    }

    public static int getContadorColaboradores() {
        return contador;
    }
}
