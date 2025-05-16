// Superclase o Clase Padre
public class Dispositivo {

    // Atributos que heredará
    protected String marca;
    protected String modelo;

    // Las superclases no heredan Constructores
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que heredará
    public void encender() {
        System.out.println("Encendiendo " + marca + " " + modelo);
    }
}
