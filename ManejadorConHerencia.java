import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class ManejadorConHerencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManejadorConHerencia extends WindowAdapter{
    public void windowClosing(WindowEvent e){ 
        System.out.println("sali"); 
        System.exit(0); 
    } 
}