import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Ventana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ventana extends JFrame implements ActionListener{ 
    // Se define el panel como variable de la clase (y no local de un método) para poder acceder a él          
    // desde cualquier método de la clase (por ej., en el actionPerformed) 
    JPanel miPanel = new JPanel(); 
    public Ventana(){ 
        this.setTitle("Ventana de Prueba");   
        this.setSize(500,400);              
        this.addWindowListener(new ManejadorConInterfaz());  
        miPanel.setLayout(new BorderLayout()); 
        Container miPanelContenedor = this.getContentPane();  
        miPanelContenedor.add(miPanel); 
        miPanel.setBackground(Color.red);    
        JButton miBoton = new JButton("Azul"); 
        // Se indica al botón quien será su gestor de eventos. Es la propia ventana (this) 
        miBoton.addActionListener(this); 
        // Se crea un objeto de tipo Dimensión. Este objeto contiene un par de valores enteros: alto y ancho (height y width) 
        Dimension d = new Dimension(); 
        // Se inicializa el alto y el ancho 
        d.height = 40; 
        d.width = 100; 
        // Se asigna al botón un tamaño preferido, empleando para ello el objeto Dimensión creado 
        // El BorderLayout respetará el alto preferido del botón al estar éste en su campo sur. 
        miBoton.setPreferredSize(d); 
        miPanel.add(miBoton, BorderLayout.SOUTH); 
    }
    // La clase Ventana debe sobreescribir este método, ya que implementa la interfaz ActionListener 
    // En el cuerpo de este método se coloca la acción a llevarse a cabo cuando se produce un evento sobre el botón 
    public void actionPerformed (ActionEvent e){ 
        miPanel.setBackground(Color.blue); 
    }
}