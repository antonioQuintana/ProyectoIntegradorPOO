

public class EejcutablePrueba
{
    public static void main(String []args){
        Ventana miVentana = new Ventana();
        miVentana.show();
        VentanaConEtiquetas venta2 = new VentanaConEtiquetas();
        venta2.show();
        
        EjemploTexto tex = new EjemploTexto();
        tex.show();
        EjemploArea texArea = new EjemploArea();
        texArea.show();
    }
}