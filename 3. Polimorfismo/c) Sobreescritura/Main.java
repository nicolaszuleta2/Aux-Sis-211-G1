/*
Sobrescritura de métodos (Overriding), es cuando una subclase redefine un método
que ya fue definido en la superclase, con la misma firma (nombre, parámetros y tipo de retorno).
Se resuelve en tiempo de ejecución (polimorfismo dinámico) y requiere herencia.
*/

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Ingeniero();
        e1.trabajar();  // Imprime: Empleado trabajando
        e2.trabajar();  // Imprime: Ingeniero trabajando
    }
}