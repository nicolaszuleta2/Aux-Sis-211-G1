/*
Es un método especial que se ejecuta automáticamente cuando creas un objeto.
Sirve para inicializar los atributos desde el inicio, sin necesidad de usar setters después.
*/

public class Main {
    public static void main(String[] args) {
        // Declaración del objeto con sus respectivos atributos (Constructor con parámetros)
        Animal animal1 = new Animal("Rex", "Perro", 5);
        animal1.mostrarInfo();
    }
}