import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton volverButton;
    private JTextField textCodigo;
    private JTextField textNombre;
    private JTextField textDetalle;
    private JTextField textPrecio;
    private JTextField textStock;
    private JPanel PanelAdmin;

    public Registro(String usuario) {
        setTitle("Registro");
        setContentPane(PanelAdmin);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = textCodigo.getText().trim();
                String nombre = textNombre.getText().trim();
                String detalle = textDetalle.getText().trim();
                String precio = textPrecio.getText().trim();
                String stock = textStock.getText().trim();
                if (codigo.isEmpty() || nombre.isEmpty() || detalle.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete los campos vacíos");

                    return;
            }
                if (precio.length() > 4 || stock.length() >3){
                    JOptionPane.showMessageDialog(null,"Precio: maximo 4 cifras. Stock solo 3 intentos");
                }
                else{
                    JOptionPane.showMessageDialog(null,"GUARDADO CORRECTAMENTE :)");
                }
                try{
                    double precioU = Double.parseDouble(precio);
                    int stockD = Integer.parseInt(stock);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Precio y Stock deben ser numeros validos");
                }


                }


        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textCodigo.setText("");
                textNombre.setText("");
                textDetalle.setText("");
                textPrecio.setText("");
                textStock.setText("");

            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones(usuario).setVisible(true);
                dispose();
            }
        });
    }
}
