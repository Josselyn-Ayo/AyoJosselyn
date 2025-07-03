import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//jOSSELYN aYO

public class Ventas extends JFrame {
    private JPanel PanelVenta;
    private JTextField textcodigo;
    private JTextField textProducto;
    private JTextField textPrecio;
    private JTextField textCantidad;
    private JTextField textSubtotal;
    private JTextField textIva;
    private JTextField textTotal;
    private JButton calcularButton;
    private JButton regresarButton;

    public Ventas(String usuario) {
        setTitle("Ventas");
        setContentPane(PanelVenta);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidad = textCantidad.getText();

                if (cantidad.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete los campos vacíos");

                    return;
                }
                if (cantidad.length() > 3 ){
                    JOptionPane.showMessageDialog(null,"Cantidad: maximo 3 cifras. Stock solo 3 intentos");
                }




            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones(usuario).setVisible(true);
                dispose();

            }
        });
    }
}
