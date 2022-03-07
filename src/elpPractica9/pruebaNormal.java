package elpPractica9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pruebaNormal {
    public static void main(String[] args){
        double media, desviacionE;
        

        

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(5);

        try {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de la media: ");
        media=sc.nextDouble();
        System.out.println("Ingresa el valor de la Desviacion estandar: ");
        desviacionE=sc.nextDouble();
        normal p1 = new normal(media,desviacionE);
        p1.calcularVFDN(0.005);
        System.out.println("El valor de f(x) = "+ df.format(p1.fX));
        p1.calcularPrFDN(1, 10, 0.003);
        System.out.println("El valor de la probabilidad es: "+ df.format(p1.areaTot));
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo: "+e.toString());
        }
        
    }
}
