import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaEjemplo extends JFrame implements ActionListener {

    private JComboBox<String> comboOpciones;
    private JButton botonAceptar;

    public VentanaEjemplo() {
        // Título de la ventana
        setTitle("Ejemplo con AWT y Swing");

        // Tamaño de la ventana
        setSize(300, 200);

        // Operación al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout simple
        setLayout(new FlowLayout());

        // Crear componentes
        comboOpciones = new JComboBox<>();
        comboOpciones.addItem("Opción 1");
        comboOpciones.addItem("Opción 2");
        comboOpciones.addItem("Opción 3");

        botonAceptar = new JButton("Aceptar");

        // Agregar los componentes al contenedor
        add(comboOpciones);
        add(botonAceptar);

        // Registrar el manejador de eventos
        botonAceptar.addActionListener(this);

        // Hacer visible la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener la opción seleccionada
        String seleccion = (String) comboOpciones.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Seleccionaste: " + seleccion);
    }

    public static void main(String[] args) {
        new VentanaEjemplo();
    }
}
