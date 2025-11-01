import java.util.*;
/**
 * Write a description of class Socio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Socio
{
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;
    
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
        this.setDni(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList());
    }
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, Prestamo p_prestamo){
        this.setDni(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList());
        this.agregarPrestamo(p_prestamo);
    }
    
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList<Prestamo> p_prestamos){
        this.setDni(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(p_prestamos);
    }
    
    //Setters -----------------------------------
    private void setDni(int p_dniSocio){
        this.dniSocio = p_dniSocio;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    protected void setDiasPrestamo(int p_diasPrestamo){
        this.diasPrestamo = p_diasPrestamo;
    }
    private void setPrestamos(ArrayList<Prestamo> p_prestamos){
        this.prestamos = p_prestamos;
    }
    //Getters -----------------------------------
    public int getDniSocio(){
        return this.dniSocio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDiasPrestamo(){
        return this.diasPrestamo;
    }
    public ArrayList<Prestamo> getPrestamos(){
        return this.prestamos;
    }
    
    //Otros metodos
    public boolean agregarPrestamo(Prestamo p_prestamo){
        return this.getPrestamos().add(p_prestamo);
    }
    public boolean quitarPrestamo(Prestamo p_prestamo){
        return this.getPrestamos().remove(p_prestamo);
    }
    
    public int cantLibrosPrestados(){
        return this.getPrestamos().size();
    }
    
    public String toString(){
        String mensaje = ("D.N.I.: "+ this.getDniSocio()+ 
                           " || " + this.getNombre()+
                           " ("+ this.soyDeLaClase() + ") || Libros Prestados: "
                           + this.cantLibrosPrestados());
        return mensaje;
    }
    public boolean puedePedir(){
        boolean flag = true;
        Calendar fechaHoy = Calendar.getInstance();
        
        for(Prestamo unPre : this.getPrestamos()){
            if(unPre.vencido(fechaHoy)) flag = false;
        }
        
        return flag;
    }
    
    public abstract String soyDeLaClase();
}
