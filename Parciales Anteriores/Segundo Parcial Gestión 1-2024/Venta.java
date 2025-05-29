// Venta.java
import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Venta() {
        productos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int calcularTotal() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}

