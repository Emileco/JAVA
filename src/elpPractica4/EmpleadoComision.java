package elpPractica4;

/**
 * Empleados con comision 
 *@author Emiliano Lecourtois 
 */
public class EmpleadoComision extends Empleados{
    private double sueldoFijo;
    private int porcentaje,ventaTotal;

    EmpleadoComision(String ids,String nombre,String apellido,double sueldoFijo,int porcentaje,int ventaTotal){
        super(ids, nombre, apellido);
        this.porcentaje=porcentaje;
        this.sueldoFijo=sueldoFijo;
        this.ventaTotal=ventaTotal;
    }

    /**
     * Regresa el sueldo totals
     * @return Salario
     */
    public double calcularSalario(){
        double salario=0;
        salario=sueldoFijo+(porcentaje*ventaTotal*.01);
        return salario;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(int ventaTotal) {
        this.ventaTotal = ventaTotal;
    }
}