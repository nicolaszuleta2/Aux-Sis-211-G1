public class Producto {
    private String nombre;
    private double precio;
    private static int totalProductos = 0;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        totalProductos++;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }

    public void mostrarInfo(String etiqueta) { // Sobrecarga
        System.out.println(etiqueta + " -> " + nombre + ": $" + precio);
    }

    public static int getTotalProductos() {
        return totalProductos;
    }
}
