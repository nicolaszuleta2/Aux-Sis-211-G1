// RegistrarVenta.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistrarVenta extends JFrame {
    private JTable tblClientes, tblProductos, tblVenta;
    private JButton btnAdd, btnAceptar, btnCancelar;
    private Venta carrito;

    public RegistrarVenta() {
        carrito = new Venta();

        setTitle("Registrar Venta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(70, 70, 750, 470);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel lblCliente = new JLabel("Clientes:");
        lblCliente.setBounds(20, 20, 120, 20);
        add(lblCliente);

        JLabel lblProducto = new JLabel("Productos:");
        lblProducto.setBounds(230, 20, 120, 20);
        add(lblProducto);

        JLabel lblVenta = new JLabel("Carrito:");
        lblVenta.setBounds(520, 20, 120, 20);
        add(lblVenta);

        tblClientes = new JTable(Datos.geDatos().getClientesMatriz(), new String[] { "Nombre", "CI" });
        JScrollPane spClientes = new JScrollPane(tblClientes);
        spClientes.setBounds(20, 50, 180, 300);
        add(spClientes);

        tblProductos = new JTable(Datos.geDatos().getProductosMatriz(), new String[] { "Nombre", "Precio" });
        JScrollPane spProductos = new JScrollPane(tblProductos);
        spProductos.setBounds(230, 50, 220, 300);
        add(spProductos);

        tblVenta = new JTable();
        JScrollPane spVenta = new JScrollPane(tblVenta);
        spVenta.setBounds(520, 50, 180, 300);
        add(spVenta);

        btnAdd = new JButton(">>");
        btnAdd.setBounds(460, 180, 50, 30);
        add(btnAdd);
        btnAdd.addActionListener(e -> {
            int fila = tblProductos.getSelectedRow();
            if (fila != -1) {
                Producto productoSeleccionado = Datos.geDatos().getProductos().get(fila);
                carrito.getProductos().add(productoSeleccionado);
                actualizarCarrito();
            }
        });

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(150, 380, 120, 30);
        add(btnAceptar);
        btnAceptar.addActionListener(e -> {
            int fila = tblClientes.getSelectedRow();
            if (fila != -1) {
                carrito.setCliente(Datos.geDatos().getClientes().get(fila));
                Datos.geDatos().getVentas().add(carrito);
                JOptionPane.showMessageDialog(this, "Venta registrada.");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente.");
            }
        });

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(340, 380, 120, 30);
        add(btnCancelar);
        btnCancelar.addActionListener(e -> dispose());
    }

    private void actualizarCarrito() {
        Object[][] datos = new Object[carrito.getProductos().size()][2];
        String[] titulos = { "Producto", "Precio" };
        int i = 0;
        for (Producto p : carrito.getProductos()) {
            datos[i++] = new Object[] { p.getNombre(), p.getPrecio() };
        }
        tblVenta.setModel(new DefaultTableModel(datos, titulos));
    }
}
