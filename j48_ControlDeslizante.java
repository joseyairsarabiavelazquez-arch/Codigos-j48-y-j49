import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class j48_ControlDeslizante {

    public static void main(String[] args) {

        // 1. Creamos la ventana
        JFrame ventana = new JFrame("Control de dos barras deslizantes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(450, 250);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Primera barra deslizante
        JSlider deslizador1 = new JSlider(0, 100, 50);
        deslizador1.setMajorTickSpacing(20);
        deslizador1.setPaintTicks(true);
        deslizador1.setPaintLabels(true);

        JLabel etiqueta1 = new JLabel("Primera barra: 50");

        // 3. Segunda barra deslizante
        JSlider deslizador2 = new JSlider(0, 100, 30);
        deslizador2.setMajorTickSpacing(20);
        deslizador2.setPaintTicks(true);
        deslizador2.setPaintLabels(true);

        JLabel etiqueta2 = new JLabel("Segunda barra: 30");

        // 4. Evento de la primera barra
        deslizador1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = deslizador1.getValue();
                etiqueta1.setText("Primera barra: " + valor);
            }
        });

        // 5. Evento de la segunda barra
        deslizador2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = deslizador2.getValue();
                etiqueta2.setText("Segunda barra: " + valor);
            }
        });

        // 6. Agregamos los componentes
        ventana.add(new JLabel("Desliza la primera barra:"));
        ventana.add(deslizador1);
        ventana.add(etiqueta1);

        ventana.add(new JLabel("Desliza la segunda barra:"));
        ventana.add(deslizador2);
        ventana.add(etiqueta2);

        // 7. Mostramos la ventana
        ventana.setVisible(true);
    }
}
