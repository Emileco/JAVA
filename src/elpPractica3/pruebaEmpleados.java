package elpPractica3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaEmpleados{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Empleados emp1 = new Empleados("sed3", "Emiliano",8, 25.6);
        System.out.println("El salario del empleado es: "+emp1.calcularSalario());
        Empleados emp2 = new Empleados("seer", "Leco",6, 23.8);
        System.out.println("El salario del empleado es: "+emp2.calcularSalario());
    }
}