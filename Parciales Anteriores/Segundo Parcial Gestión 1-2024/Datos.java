// Datos.java
import java.util.ArrayList;

public class Datos {
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;

    private static Datos datos;

    private Datos() {
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public static Datos geDatos() {
        if (datos == null) {
            datos = new Datos();
        }
        return datos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Object[][] getClientesMatriz() {
        Object[][] datos = new Object[clientes.size()][2];
        int i = 0;
        for (Cliente c : clientes) {
            datos[i++] = new Object[] { c.getNombre(), c.getCi() };
        }
        return datos;
    }

    public Object[][] getProductosMatriz() {
        Object[][] datos = new Object[productos.size()][2];
        int i = 0;
        for (Producto p : productos) {
            datos[i++] = new Object[] { p.getNombre(), p.getPrecio() };
        }
        return datos;
    }

    public Object[][] getVentaMatriz() {
        Object[][] datos = new Object[ventas.size()][3];
        int i = 0;
        for (Venta v : ventas) {
            datos[i++] = new Object[] {
                v.getCliente().getNombre(),
                v.getProductos().size(),
                v.calcularTotal()
            };
        }
        return datos;
    }
}
