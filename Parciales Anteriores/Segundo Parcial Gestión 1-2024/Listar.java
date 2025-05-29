// Listar.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Listar extends JFrame {
    private JComboBox<String> cmbFuente;
    private JTable tblDatos;

    public Listar() {
        setTitle("Listado de Datos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(70, 70, 350, 400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel lblFuente = new JLabel("Fuente de datos:");
        lblFuente.setBounds(20, 20, 200, 20);
        add(lblFuente);

        cmbFuente = new JComboBox<>(new String[] { "Clientes", "Productos", "Ventas" });
        cmbFuente.setBounds(20, 50, 200, 25);
        add(cmbFuente);
        cmbFuente.addActionListener(e -> cargarDatos());

        tblDatos = new JTable();
        JScrollPane spTabla = new JScrollPane(tblDatos);
        spTabla.setBounds(20, 90, 300, 250);
        add(spTabla);

        cargarDatos();
    }

    private void cargarDatos() {
        String seleccion = cmbFuente.getSelectedItem().toString();
        if (seleccion.equals("Clientes")) {
            tblDatos.setModel(new DefaultTableModel(
                Datos.geDatos().getClientesMatriz(),
                new String[] { "Nombre", "CI" }
            ));
        } else if (seleccion.equals("Productos")) {
            tblDatos.setModel(new DefaultTableModel(
                Datos.geDatos().getProductosMatriz(),
                new String[] { "Nombre", "Precio" }
            ));
        } else {
            tblDatos.setModel(new DefaultTableModel(
                Datos.geDatos().getVentaMatriz(),
                new String[] { "Cliente", "Cant. Productos", "Costo Total" }
            ));
        }
    }
}
