// Subclase o Clase Hija
public class Laptop extends Dispositivo // Para heredar se usa la palabra reservada "extends" seguido del nombre de la Clase (en este caso "Dispositivo")
{
    // Atributo propio de la clase
    private int ramGB;

    // Constructor
    public Laptop(String marca, String modelo, int ramGB) {
        super(marca, modelo); // Llama al constructor de la superclase para declarar sus atributos heredados
        this.ramGB = ramGB;
    }

    // Método propio de la clase
    public void mostrarInfo() {
        System.out.println("Laptop: " + marca + " " + modelo);
        System.out.println("RAM: " + ramGB + " GB");
    }
}
