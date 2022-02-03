package elpPractica2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Practicados{
        private static String[] ids = new String[30];
    private static String[] nombre = new String[30];
    private static double[] hTrabajadas = new double[30];
    private static double[] sHora = new double[30];
    private static double totalPagar;
    private static int nEmpleados,i;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numero de empleados: ");
        nEmpleados = Integer.valueOf(br.readLine()).intValue();
        for (i = 0; i < nEmpleados; i++) {
            System.out.println("Numero identificador");
            ids[i] = br.readLine();
            System.out.println("Escriba nombre del empleado: ");
            nombre[i] = br.readLine();
            System.out.println("Numero de horas trabajadas: ");
            hTrabajadas[i] = Double.valueOf(br.readLine()).doubleValue();
            System.out.println("Sueldo por hora empleado: ");
            sHora[i] = Double.valueOf(br.readLine()).doubleValue();
        }
        for (i = 0; i<nEmpleados; i++) {
            totalPagar+=(hTrabajadas[i] * sHora[i]);
        }
        System.out.println("Total a pagar: "+totalPagar);
    }
}