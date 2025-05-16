// Subclase o Clase Hija
public class Celular extends Dispositivo // Para heredar se usa la palabra reservada "extends" seguido del nombre de la Clase (en este caso "Dispositivo")
{
    // Atributo propio de la clase
    private boolean tiene5G;

    // Constructor
    public Celular(String marca, String modelo, boolean tiene5G) {
        super(marca, modelo); // Llama al constructor de la superclase para declarar sus atributos heredados
        this.tiene5G = tiene5G;
    }

    // Método propio de la clase
    public void mostrarInfo() {
        System.out.println("Celular: " + marca + " " + modelo);
        System.out.println("Soporte 5G: " + (tiene5G ? "Sí" : "No"));
    }
}
