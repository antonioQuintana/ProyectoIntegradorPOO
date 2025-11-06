import javax.swing.*;
import java.awt.*;

public class VentanaFullscreen extends JFrame {
    public VentanaFullscreen() {
        //this.setUndecorated(true); // Quita bordes y barra de título
        this.setResizable(false);  // Opcional: evita que se redimensione

        // Obtener el dispositivo gráfico (monitor)
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        // Establecer esta ventana como pantalla completa
        if (gd.isFullScreenSupported()) {
            gd.setFullScreenWindow(this);
        } else {
            System.out.println("Pantalla completa no soportada. Usando maximizado.");
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new VentanaFullscreen();
    }
}
