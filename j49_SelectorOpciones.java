import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j49_SelectorOpciones {

    public static void main(String[] args) {

        // 1. Crear ventana principal
        JFrame ventana = new JFrame("Selector de opciones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(450, 250);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Primera lista: marcas de carros
        String[] marcas = {
                "Toyota", "Nissan", "Chevrolet", "Ford", "Honda"
        };

        JComboBox<String> comboMarcas = new JComboBox<>(marcas);

        // 3. Segunda lista: tipos de combustible
        String[] combustibles = {
                "Gasolina", "Diesel", "Híbrido", "Eléctrico"
        };

        JComboBox<String> comboCombustibles =
                new JComboBox<>(combustibles);

        // 4. Etiqueta para mostrar resultados
        JLabel etiqueta = new JLabel("Selecciona las opciones.");

        // 5. Evento de la primera lista
        comboMarcas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = (String) comboMarcas.getSelectedItem();
                etiqueta.setText("Marca seleccionada: " + marca);
            }
        });

        // 6. Evento de la segunda lista
        comboCombustibles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String combustible =
                        (String) comboCombustibles.getSelectedItem();
                etiqueta.setText("Combustible: " + combustible);
            }
        });

        // 7. Agregar elementos a la ventana
        ventana.add(new JLabel("Selecciona una marca de carro:"));
        ventana.add(comboMarcas);

        ventana.add(new JLabel("Selecciona el combustible:"));
        ventana.add(comboCombustibles);

        ventana.add(etiqueta);

        // 8. Mostrar ventana
        ventana.setVisible(true);
    }
}