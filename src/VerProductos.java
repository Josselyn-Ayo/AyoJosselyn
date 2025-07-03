import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerProductos extends JFrame {
    private JPanel panel1;
    private JButton volverButton;
    private JButton mostrarButton;

    public VerProductos(String usuario) {
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuOpciones(usuario).setVisible(true);
                dispose();
            }
        });
    }
}
