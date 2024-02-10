import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ejercicio_1 extends JFrame implements ActionListener {
    private JLabel mensaje;

    public Ejercicio_1() {
        setTitle("Galleta de la fortuna");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
// Creamos el boton para que imprima el mensaje
        JButton button = new JButton("Obtener mensaje");
        button.addActionListener(this);
        panel.add(button, BorderLayout.CENTER); 
// Mostramos un mensaje indicandole al usuario que precione el boton
        mensaje = new JLabel("Presiona el botón para obtener un mensaje aleatorio.");
        panel.add(mensaje, BorderLayout.NORTH);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String[] mensajes_aleatorios = {
                "La suerte te sonríe hoy.",
                "Prueba de nuevo mañana.",
                "La perseverancia es la clave del éxito.",
                "No temas tomar riesgos.",
                "La creatividad te llevará lejos.",
                "Aprende de tus errores.",
                "El trabajo duro da sus frutos.",
                "La paciencia es una virtud.",
                "Sé amable con los demás.",
                "Confía en tu intuición."
        };
// creamos un metodo aleatorio 
        Random random = new Random();
        int index = random.nextInt(mensajes_aleatorios.length);
        String texto = mensajes_aleatorios[index];
        mensaje.setText(texto);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_1().setVisible(true);
            }
        });
    }
}