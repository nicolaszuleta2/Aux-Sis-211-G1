/*
La herencia permite que una clase (llamada subclase o hija) herede
atributos y métodos de otra clase (llamada superclase o padre).
Esto permite la reutilización de código en clases similares, sin 
reescribirlo directamente, así creamos una única clase base con lo común.
*/

public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular("Samsung", "Galaxy S22", true);
        Laptop lap = new Laptop("Dell", "XPS 13", 16);

        cel.encender(); // Método heredado
        cel.mostrarInfo();

        System.out.println("---------------");

        lap.encender(); // Método heredado
        lap.mostrarInfo();
    }
}
