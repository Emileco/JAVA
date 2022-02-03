package elpPractica4;

/**
 * Empleados con sueldo fijo mensual
 * @author Emiliano Lecourtois 
 */
public class EmpleadoSueldoF extends Empleados{
    private double sueldoF;

    EmpleadoSueldoF(String ids, String nombre, String apellido,double sueldoF) {
        super(ids, nombre, apellido);
        this.sueldoF=sueldoF;
    }

    /**
     * Regresa el sueldo total
     * @return SueldoF
     */
    public double calcularSalario(){
        return sueldoF;
    }
}