package elpPractica3;

/**
 * Registro de empleados
 * @author Emiliano Lecourtois Perez
 */
public class Empleados{
    private String[] ids = new String[30];
    private  String[] nombre = new String[30];
    private  double[] hTrabajadas = new double[30];
    private  double[] sHora = new double[30];
    private int nEmpleados, i;

    /**
     * Constructor
     * @author Emiliano Lecourtois
     * @param ids
     * @param nombre
     * @param hTrabajadas
     * @param sHora
     */
    Empleados(String ids, String nombre, double hTrabajadas, double sHora) {
        this.ids[1] = ids;
        this.nombre[1]=nombre;
        this.hTrabajadas[1]=hTrabajadas;
        this.sHora[1]=sHora;
    }

    /**
     * Calcula el salario
     * @author Emiliano Lecourtois 
     * @return salario
     */

    public double calcularSalario(){
        return (hTrabajadas[1])*(sHora[1]);
    }
}