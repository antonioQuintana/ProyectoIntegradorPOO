import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class EjemploTexto extends JFrame { 
    JTextField campo1, campo2; 
    public EjemploTexto() { 
        Container miContenedor = this.getContentPane();        
        miContenedor.setLayout(new BoxLayout(miContenedor, BoxLayout.Y_AXIS)); 
        campo1 = new JTextField("Ingrese el texto y presione enter",20);  
        campo1.addActionListener(new TextFieldListener()); 
        // Asigna un borde color negro 
        campo1.setBorder(BorderFactory.createLineBorder(Color.black)); 
        campo2 = new JTextField(20);    
        // Asigna un borde color azul 
        campo2.setBorder(BorderFactory.createLineBorder(Color.blue)); 
        JButton miBoton = new JButton("Limpiar"); 
        // Agrega un “oyente” a la acción de este botón. 
        miBoton.addActionListener(new ButtonListener());            
        miContenedor.add(campo1); // Agrega campo1. 
        miContenedor.add(campo2); // Agrega campo2 
        miContenedor.add(Box.createVerticalGlue());  
        miContenedor.add(miBoton);  
    } 
    //  Clase oyente Campo de Texto 
    class TextFieldListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
        campo2.setText(e.getActionCommand()); 
        } 
    } 
    //  Clase oyente del boton 
    class ButtonListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
        // Limpia ambos Campos de Texto 
        campo1.setText(""); 
        campo1.requestFocus(); // Toma el foco 
        campo2.setText(""); 
        } 
    } 
} 