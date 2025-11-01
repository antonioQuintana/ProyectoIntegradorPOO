import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Ventana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
    public Ventana()
    {
        this.setTitle("Ventana de prueba");
        this.setSize(500,400);
        
        //se indica quien sera el manejador de eventos
        this.addWindowListener(new ManejadorConHerencia());
        
        //agregando un panel y pintando de rojo  
        JPanel miPanel = new JPanel(); 
        JPanel panel2 = new JPanel();
        /*miPanel.setLayout(null); --------------prueba1-----------------------------------        
        JButton boton = new JButton();   
        // Elimina el gestor de layouts por defecto del panel 
        // Crea un objeto de tipo JButton (un botón) 
        // Este método indica al botón que se sitúe en las coordenadas 300,300 del panel, con un tamaño de 50x50 
        boton.setBounds(300,300,50,50); //es una ubicacion fija que confunde
        miPanel.add(boton); --------------------------------------------------------*/
        
        /*FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 10); ---prueba2-----------------------
        miPanel.setLayout(fl); 
        for (int i=0; i<4; i++) { 
            JButton miBoton = new JButton("Boton "+(i+1)); 
            miBoton.setPreferredSize(new Dimension(100,25)); 
            miPanel.add(miBoton); 
        } ----------------------------------------------------------------------------------*/
        
        /* GridLayout miGrid = new GridLayout(3,2, 5,5); ----------------preuba3-----------------
         miPanel.setLayout(miGrid); 
          for (int i=0; i<6; i++) { 
            JButton miBoton = new JButton("Boton "+(i+1)); 
            miPanel.add(miBoton); 
          } ----------------------------------------------------------------------------------*/
      
        miPanel.setLayout(new BorderLayout(2,2)); 
        String[] misLugares = {BorderLayout.NORTH, BorderLayout.SOUTH,  
                             BorderLayout.EAST, BorderLayout.WEST,     
                             BorderLayout.CENTER }; 
        String[] nombreBoton = { "Boton Norte", "Boton Sur", "Boton Este",  
                               "Boton Oeste", "Boton Centro" }; 
        for (int i=0; i<misLugares.length; i++) { 
           JButton miBoton = new JButton(nombreBoton[i]); 
           miPanel.add(miBoton, misLugares[i]); 
        } 
        //creando jbuttosnsss
        //JButton miBoton = new JButton(); 
        JButton miJBoton = new JButton("soy un JBoton");         
        panel2.add(miJBoton, BorderLayout.CENTER);        
        Container miPanelContenedor = this.getContentPane();  
        miPanelContenedor.add(miPanel, BorderLayout.CENTER); 
        miPanelContenedor.add(panel2, BorderLayout.SOUTH); 

        miPanel.setBackground(Color.red);
        panel2.setBackground(Color.blue);
    }

}