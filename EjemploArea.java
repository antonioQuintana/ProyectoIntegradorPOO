import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class EjemploArea extends JFrame implements ActionListener{ 
    JTextArea areaTexto; 
    JButton mostrar; 
    public EjemploArea(){ 
        //Instancia objetos de tipo área de texto y botón 
        areaTexto = new JTextArea(" ",5,30); 
        mostrar = new JButton("Presionar");     
        JScrollPane scrollPane = new JScrollPane(areaTexto); 
        Container miContenedor = this.getContentPane();        
        miContenedor.add(scrollPane, BorderLayout.CENTER); 
        //Instancia y registra un receptor de eventos de tipo Action sobre el boton 
        mostrar.addActionListener(this); 
        miContenedor.setLayout (new FlowLayout ());                                                                                              
        miContenedor.add(areaTexto); 
        miContenedor.add(mostrar);        
    } 
    public void actionPerformed( ActionEvent evt ) { 
        if(evt.getActionCommand()=="Presionar"){      
            areaTexto.append("Se presionó el botón   "+"\n"); 
        } 
    }
} 