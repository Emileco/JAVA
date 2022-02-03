package elpPractica4;

public class Empresa{
    private String id,nombre,direccion;
    public Empleados[] emp = new Empleados[30];
    public EmpleadoSueldoF[] empsf = new EmpleadoSueldoF[30];
    public EmpleadoComision[] empco = new EmpleadoComision[30];
    int numeroEmpleados=0,numeroEmpleadosComision=0,numeroEmpleadosSF;
    
    Empresa(String id,String nombre,String direccion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    /**
     * Genera un nuevo empleado
     * @author Emiliano Lecourtois 
     * @param ids
     * @param nombre
     * @param apellido
     * @param hTrabajadas
     * @param sHora
     */

     /**
      * Agrega un empleado de tipo hora
      * @param ids
      * @param nombre
      * @param apellido
      * @param hTrabajadas
      * @param sHora
      */
    public void agregarEmpleado(String ids,String nombre,String apellido,double hTrabajadas,double sHora){
        Empleados empleado = new Empleados(ids, nombre, apellido);
        empleado.sethTrabajadas(hTrabajadas);
        empleado.setsHora(sHora);
        emp[numeroEmpleados]=empleado;
        numeroEmpleados++;
    }


    /**
     * Agrega un empleado tipo comision
     * @param ids
     * @param nombre
     * @param apellido
     * @param sueldoFijo
     * @param porcentaje
     * @param ventaTotal
     */
    public void agregarEmpleadoComision(String ids,String nombre,String apellido,double sueldoFijo,int porcentaje, int ventaTotal){
        EmpleadoComision empleado = new EmpleadoComision(ids, nombre, apellido, sueldoFijo, porcentaje, ventaTotal);
        empco[numeroEmpleadosComision]=empleado;
        numeroEmpleadosComision++;
    }

    /**
     * agrega un empleado tipo sueldo fijo
     * @param ids
     * @param nombre
     * @param apellido
     * @param sueldoF
     */
    public void agregarEmpleadoSueldoF(String ids,String nombre,String apellido,double sueldoF){
        EmpleadoSueldoF empleado = new EmpleadoSueldoF(ids, nombre, apellido, sueldoF);
        empsf[numeroEmpleadosSF]=empleado;
        numeroEmpleadosSF++;
    }
    /**
     * Calcula la nomina total de todos los empleados
     * @author Emiliano Lecourtois 
     * @return total
     */
    public double calcularNominaTotal(){
        double total=0;
        int i=0;
        for ( i = 0; i < numeroEmpleados; i++) {
            total+=(emp[i].calcularSalario());
        }

        for (i = 0; i < numeroEmpleadosComision; i++) {
            total+=(empco[i].calcularSalario());
        }

        for ( i = 0; i < numeroEmpleadosSF; i++) {
            total+=(empsf[i].calcularSalario());
        }

        return total;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroEmpleadosComision() {
        return numeroEmpleadosComision;
    }

    public void setNumeroEmpleadosComision(int numeroEmpleadosComision) {
        this.numeroEmpleadosComision = numeroEmpleadosComision;
    }

    public int getNumeroEmpleadosSF() {
        return numeroEmpleadosSF;
    }

    public void setNumeroEmpleadosSF(int numeroEmpleadosSF) {
        this.numeroEmpleadosSF = numeroEmpleadosSF;
    }

    public Empleados[] getEmp() {
        return emp;
    }

    public void setEmp(Empleados[] emp) {
        this.emp = emp;
    }

    public EmpleadoSueldoF[] getEmpsf() {
        return empsf;
    }

    public void setEmpsf(EmpleadoSueldoF[] empsf) {
        this.empsf = empsf;
    }

    public EmpleadoComision[] getEmpco() {
        return empco;
    }

    public void setEmpco(EmpleadoComision[] empco) {
        this.empco = empco;
    }
    
}