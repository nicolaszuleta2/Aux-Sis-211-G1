// Clase Principal
public class Main {
    // Método Principal (Lo primero que se ejecuta en nuestro programa)
    public static void main(String[] args) {

         // Crear objeto
        Persona persona1;

        // Inicialización del objeto
        persona1 = new Persona();
        
        // Cambiar atributos de la Persona directamente (No recomendable)
        persona1.nombre = "Ana";
        persona1.edad = 25;
        
        // Llamar al método de la clase
        persona1.saludar();
    }
}
