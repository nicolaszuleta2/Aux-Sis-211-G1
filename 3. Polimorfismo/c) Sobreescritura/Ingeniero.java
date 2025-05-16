public class Ingeniero extends Empleado {
    // Se usa "@Override" para sobreentender que método se esta sobreescribiendo.
    @Override
    public void trabajar() {
        System.out.println("Ingeniero trabajando");
    }
}
