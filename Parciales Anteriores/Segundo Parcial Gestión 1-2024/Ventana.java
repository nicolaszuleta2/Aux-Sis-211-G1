// Ventana.java
import javax.swing.*;

public class Ventana extends JFrame {
    private JButton btnRegistrarCliente, btnRegistrarProducto, btnRegistrarVenta, btnListar, btnSalir;

    public Ventana() {
        setTitle("Sistema de Ventas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 300, 350);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        btnRegistrarCliente = new JButton("Registrar Cliente");
        btnRegistrarCliente.setBounds(50, 40, 180, 30);
        add(btnRegistrarCliente);
        btnRegistrarCliente.addActionListener(e -> new RegistrarCliente().setVisible(true));

        btnRegistrarProducto = new JButton("Registrar Producto");
        btnRegistrarProducto.setBounds(50, 90, 180, 30);
        add(btnRegistrarProducto);
        btnRegistrarProducto.addActionListener(e -> new RegistrarProducto().setVisible(true));

        btnRegistrarVenta = new JButton("Registrar Venta");
        btnRegistrarVenta.setBounds(50, 140, 180, 30);
        add(btnRegistrarVenta);
        btnRegistrarVenta.addActionListener(e -> new RegistrarVenta().setVisible(true));

        btnListar = new JButton("Listar Datos");
        btnListar.setBounds(50, 190, 180, 30);
        add(btnListar);
        btnListar.addActionListener(e -> new Listar().setVisible(true));

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(50, 240, 180, 30);
        add(btnSalir);
        btnSalir.addActionListener(e -> System.exit(0));
    }
}
