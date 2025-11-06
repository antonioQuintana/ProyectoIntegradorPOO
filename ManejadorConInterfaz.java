import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class ManejadorConInterfaz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManejadorConInterfaz implements WindowListener{
   /**
     * Constructor for objects of class ManejadorConInterfaz
   */
   public void windowClosing(WindowEvent e){ 
      System.out.println("sali"); 
      System.exit(0);  // Esta sentencia termina la máquina virtual 
   } 

   public void windowOpened(WindowEvent e){} 
   public void windowClosed(WindowEvent e){} 
   public void windowActivated(WindowEvent e){} 
   public void windowDeactivated(WindowEvent e){} 
   public void windowIconified(WindowEvent e){} 
   public void windowDeiconified(WindowEvent e){}
}