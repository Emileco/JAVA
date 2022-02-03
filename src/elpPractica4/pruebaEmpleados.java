 package elpPractica4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaEmpleados{
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        Empresa empresa1 = new Empresa("empla","Emiliano","periferico");
        empresa1.agregarEmpleado("empia","Mauricio", "Flores", 100, 200);
        empresa1.agregarEmpleado("empia","Emiliano", "Lecourtois", 50, 200);
        empresa1.agregarEmpleadoComision("empia","Emiliano", "Lecourtois", 1500, 10, 9000);
        empresa1.agregarEmpleadoComision("empia","Irving", "Laguna", 1000, 20, 7000);
        empresa1.agregarEmpleadoSueldoF("empia", "Pablo", "Barrera", 2000);
        empresa1.agregarEmpleadoSueldoF("empia", "Berenice", "Mendez", 8700);
        double total=empresa1.calcularNominaTotal();
        System.out.println("La empresa tiene una nomina total de "+total);
        System.out.println("No empleados por Horas Trabajadas: "+empresa1.getNumeroEmpleados());
        System.out.println("No empleados por Comision: "+empresa1.getNumeroEmpleadosComision());
        System.out.println("No empleados por Sueldo Fijo: "+empresa1.getNumeroEmpleadosSF());
        for(int i=0;i<empresa1.numeroEmpleadosComision;i++){
        System.out.println("El empleado "+(i+1)+" por comision se llama: "+empresa1.empco[i].getNombre()+" "+empresa1.empco[i].getApellido());
        System.out.println("El empleado "+(i+1)+" por comision tiene de id: "+empresa1.empco[i].getIds());
        System.out.println("El empleado "+(i+1)+" por comision tiene un sueldo fijo de: "+empresa1.empco[i].getSueldoFijo()+" y una venta total de: "+empresa1.empco[i].getVentaTotal()+" con un porcentaje de: "+empresa1.empco[i].getPorcentaje());
        }
    }
}
