import java.util.*;
/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante extends Socio
{
    private String carrera;
    
    public Estudiante(int p_dniSocio, String p_nombre, int p_diasPrestamo, String p_carrera){
        super(p_dniSocio, p_nombre, p_diasPrestamo);
        this.setCarrera(p_carrera);
    }
    public Estudiante(int p_dniSocio, String p_nombre, int p_diasPrestamo, Prestamo p_prestamo, String p_carrera){
        super(p_dniSocio, p_nombre, p_diasPrestamo, p_prestamo);
        this.setCarrera(p_carrera);
    }    
    public Estudiante(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList<Prestamo> p_prestamos, String p_carrera){
        super(p_dniSocio, p_nombre, p_diasPrestamo, p_prestamos);
        this.setCarrera(p_carrera);
    }
    
    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    public String getCarrera(){
        return this.carrera;
    }
    
    //otros metodos -----------------------------------------
    public boolean puedePedir(){
        int librosSinDevolver = 0;
        if(!super.puedePedir()) return false;
        
        for(Prestamo unPre : this.getPrestamos()){
            if(unPre.getFechaDevolucion() == null) librosSinDevolver++;
        }
        if(librosSinDevolver <= 3){
            return true;
        }else{
            return false;
        }
    }
    public String soyDeLaClase(){
        return "Estudiante";
    }
    
}