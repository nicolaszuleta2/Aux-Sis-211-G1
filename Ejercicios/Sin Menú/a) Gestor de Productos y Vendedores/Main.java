public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Teclado", 25.0);
        Producto p2 = new Producto("Mouse", 15.5);
        p1.mostrarInfo();
        p2.mostrarInfo("OFERTA");

        // Crear vendedores
        Vendedor v1 = new Vendedor("Laura", 30, "Zona Norte");
        Vendedor v2 = new Vendedor("Carlos", 28, "Zona Sur");

        // Polimorfismo con array de Registrables
        Registrable[] registros = { v1, v2 };

        for (Registrable r : registros) {
            r.registrar();

            if (r instanceof Persona) {
                ((Persona) r).mostrarInfo(); // Polimorfismo
            }
        }

        System.out.println("Total de productos: " + Producto.getTotalProductos());
        System.out.println("Total de vendedores: " + Vendedor.getTotalVendedores());
    }
}
