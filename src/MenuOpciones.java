import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuOpciones extends JFrame {
    private JPanel PanelMenu;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;


    public MenuOpciones(String usuario) {
        setTitle("Menu de Opciones");
        setContentPane(PanelMenu);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registro(usuario).setVisible(true);
                dispose();

            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ventas(usuario).setVisible(true);
                dispose();

            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerProductos(usuario).setVisible(true);
                dispose();

            }
        });
    }
}
