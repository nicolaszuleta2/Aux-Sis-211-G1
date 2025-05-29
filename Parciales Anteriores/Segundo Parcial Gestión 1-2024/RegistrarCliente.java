// RegistrarCliente.java
import javax.swing.*;

public class RegistrarCliente extends JFrame {
    private JTextField txtNombre, txtCi;
    private JButton btnAceptar, btnCancelar;

    public RegistrarCliente() {
        setTitle("Registrar Cliente");
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

        JLabel lblCi = new JLabel("Cédula:");
        lblCi.setBounds(20, 60, 150, 20);
        add(lblCi);

        txtCi = new JTextField();
        txtCi.setBounds(180, 60, 180, 20);
        add(txtCi);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 150, 120, 30);
        add(btnAceptar);
        btnAceptar.addActionListener(e -> {
            Cliente nuevo = new Cliente();
            nuevo.setNombre(txtNombre.getText());
            nuevo.setCi(txtCi.getText());
            Datos.geDatos().getClientes().add(nuevo);
            JOptionPane.showMessageDialog(this, "Cliente registrado.");
            dispose();
        });

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(220, 150, 120, 30);
        add(btnCancelar);
        btnCancelar.addActionListener(e -> dispose());
    }
}
