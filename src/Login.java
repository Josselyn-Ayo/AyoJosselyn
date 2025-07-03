import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton Acceder;
    private JButton Limpiar;

    public Login() {
        setTitle("Login");
        setContentPane(panel1);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String contrasena = new String(passwordField1.getPassword());
                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete los campos vacíos");
                    return;

                }
                if (usuario.equals("Ayo") && contrasena.equals("esfot123")) {
                    JOptionPane.showMessageDialog(null,"BIENVENIDOS A MENÚ DE OPCIONES");
                    new MenuOpciones(usuario).setVisible(true);
                    dispose();

                }

            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }
}