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
    // Además del panel, se definen cuatro variables puntero a objetos botón como variables de la clase           
    // para poder accederlos desde cualquier método de la clase 
    JPanel miPanel = new JPanel(); 
    private JButton bAzul; 
    private JButton bRosa; 
    private JButton bAmarillo; 
    private JButton bVerde; 
    public Ventana(){ 
        this.setTitle("Ventana de Prueba");   
        this.setSize(500,400);              
        this.addWindowListener(new ManejadorConInterfaz());  
        miPanel.setLayout(new BorderLayout()); 
        Container miPanelContenedor = this.getContentPane();  
        miPanelContenedor.add(miPanel); 
        miPanel.setBackground(Color.red);    
        Dimension d = new Dimension(); 
        d.height = 40; 
        d.width = 100; 
        // Se inicializa la varible bAzul 
        bAzul = new JButton("Azul"); 
        // Se indica la Ventana como gestor de los eventos del botón azul 
        bAzul.addActionListener(this); 
        bAzul.setPreferredSize(d); 
        bVerde = new JButton("Verde"); 
        bVerde.addActionListener(this); 
        bVerde.setPreferredSize(d); 
        bAmarillo = new JButton("Amarillo"); 
        bAmarillo.addActionListener(this); 
        bAmarillo.setPreferredSize(d); 
        bRosa = new JButton("Rosa"); 
        bRosa.addActionListener(this); 
        bRosa.setPreferredSize(d); 
        // Se añaden los cuatro botones en el norte, sur, este y oeste del panel 
        miPanel.add(bAzul,BorderLayout.SOUTH); 
        miPanel.add(bVerde,BorderLayout.NORTH); 
        miPanel.add(bAmarillo,BorderLayout.EAST); 
        miPanel.add(bRosa,BorderLayout.WEST); 
    } 
    public void actionPerformed (ActionEvent e){ 
        // Se utiliza información encapsulado en el evento de tipo ActionEvent para saber que botón se pulsó.  
        // En la variable fuente de tipo Object  se almacena la referencia al objeto fuente de este evento,  
        // es decir la referencia al botón que se pulsó. 
        Object fuente = e.getSource(); 
        //Si la referencia es igual a la puntero que apunta la botón bAzul es que fue éste el que se pulsó 
        if (fuente == bAzul){ 
            miPanel.setBackground(Color.blue); 
        } 
        if (fuente == bVerde){ 
            miPanel.setBackground(Color.green); 
        } 
        if (fuente == bAmarillo){ 
            miPanel.setBackground(Color.yellow); 
        } 
        if (fuente == bRosa){ 
            miPanel.setBackground(Color.pink); 
        } 
    } 
} 