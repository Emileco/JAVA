package elpPractica4;

/**
 * Registro de empleados
 * @author Emiliano Lecourtois Perez
 */
public class Empleados{
    private String ids;
    private  String nombre,apellido;
    private  double hTrabajadas;
    
    private  double sHora;
    private int nEmpleados, i;

    /**
     * Constructor
     * @author Emiliano Lecourtois
     * @param ids
     * @param nombre
     * @param hTrabajadas
     * @param sHora
     */
    Empleados(String ids, String nombre, String apellido) {
        this.ids = ids;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    /**
     * Calcula el salario
     * @author Emiliano Lecourtois 
     * @return salario
     */

    public double calcularSalario(){
        return (hTrabajadas)*(sHora);
    }
    

    public void sethTrabajadas(double hTrabajadas) {
        if(hTrabajadas<=500)
            this.hTrabajadas = hTrabajadas;
        else
            this.hTrabajadas = -1;    
    }

    public void setsHora(double sHora) {
        if(sHora<=1500)
            this.sHora = sHora;
        else
            this.sHora = -1;    
    }

    public double gethTrabajadas() {
        return hTrabajadas;
    }

    public double getsHora() {
        return sHora;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}