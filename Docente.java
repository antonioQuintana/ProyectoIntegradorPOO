import java.util.*;
/**
 * Write a description of class Docente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Docente extends Socio{
    private String area;
    
    public Docente(int p_dniSocio, String p_nombre, int p_diasPrestamo, String p_area){
        super(p_dniSocio, p_nombre, p_diasPrestamo);
        this.setArea(p_area);
    }
    public Docente(int p_dniSocio, String p_nombre, int p_diasPrestamo, Prestamo p_prestamo, String p_area){
        super(p_dniSocio, p_nombre, p_diasPrestamo, p_prestamo);
        this.setArea(p_area);
    }    
    public Docente(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList<Prestamo> p_prestamos, String p_area){
        super(p_dniSocio, p_nombre, p_diasPrestamo, p_prestamos);
        this.setArea(p_area);
    }
    
    private void setArea(String p_area){
        this.area = p_area;
    }
    public String getArea(){
        return this.area;
    }
    
    //otros metodos -----------------------------------------
    public boolean esResponsable(){
        boolean flag = true;
        for(Prestamo unPre : this.getPrestamos()){
            if (unPre.vencido(unPre.getFechaDevolucion())) flag = false;
        }
        return flag;
    }
    public void cambiarDiasDePrestamo(int p_dias){
        if(this.esResponsable()){
            this.setDiasPrestamo( this.getDiasPrestamo() + p_dias);
            System.out.println("Se agregaron " + p_dias + " de prestamo por ser Responsable");
        }else{
            System.out.println("No se pueden agregar días porque no es responsable");
        }
        
    }
    public String soyDeLaClase(){
        return "Docente";
    }
    
       
}