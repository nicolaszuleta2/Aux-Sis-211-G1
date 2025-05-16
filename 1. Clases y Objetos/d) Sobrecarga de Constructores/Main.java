/*
Es cuando una clase tiene más de un constructor, pero con diferentes parámetros.
Esto permite crear objetos de distintas formas según la información disponible.
*/

public class Main {
    public static void main(String[] args) {
        // Prueba de todos los Constructores declarados
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2020);
        Vehiculo v2 = new Vehiculo("Ford", "Focus");
        Vehiculo v3 = new Vehiculo("Chevrolet");

        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();
    }
}
