import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Test::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Formulario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel label = new JLabel("Formulario simple:");
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField(15);
        JButton button = new JButton("Botón");

        button.addActionListener(e -> {
            String nombre = nameField.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Introduce tu nombre");
            } else {
                JOptionPane.showMessageDialog(frame, "Hola, " + nombre);
            }
        });

        panel.add(label);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
} 

