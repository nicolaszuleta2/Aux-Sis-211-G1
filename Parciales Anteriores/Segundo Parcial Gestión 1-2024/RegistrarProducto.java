// RegistrarProducto.java
import javax.swing.*;

public class RegistrarProducto extends JFrame {
    private JTextField txtNombre, txtPrecio;
    private JButton btnAceptar, btnCancelar;

    public RegistrarProducto() {
        setTitle("Registrar Producto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(70, 70, 400, 250);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 150, 20);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(180, 20, 180, 20);
        add(txtNombre);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(20, 60, 150, 20);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(180, 60, 180, 20);
        add(txtPrecio);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 150, 120, 30);
        add(btnAceptar);
        btnAceptar.addActionListener(e -> {
            Producto nuevo = new Producto();
            nuevo.setNombre(txtNombre.getText());
            nuevo.setPrecio(Integer.parseInt(txtPrecio.getText()));
            Datos.geDatos().getProductos().add(nuevo);
            JOptionPane.showMessageDialog(this, "Producto registrado.");
            dispose();
        });

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(220, 150, 120, 30);
        add(btnCancelar);
        btnCancelar.addActionListener(e -> dispose());
    }
}
