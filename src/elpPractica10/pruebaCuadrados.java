package elpPractica10;

public class pruebaCuadrados{

    public static void main(String[] args){

        double[] valoresx = {30,28,32,25,25,25,22,24,35,40};
        double[] valoresy = {25,30,27,40,42,40,50,45,30,25};
        double promedioX,promedioY,cov=0,s=0,B1,B0,ordenada;

        promedio ej1 = new promedio();
        promedioX=ej1.promedioX(valoresx);
        promedioY=ej1.promedioX(valoresy);
        
        for (int i = 0; i < valoresx.length; i++) {
            cov+=(valoresx[i]-promedioX)*(valoresy[i]-promedioY);
            s+=(Math.pow(valoresx[i]-promedioX,2));
        }
        B1=cov/s;
        B0=promedioY-(B1*promedioX);
        for(int i=0;i < valoresx.length;i++){
            System.out.println("Ordenada en "+(i+1)+" es "+(B0+(B1*valoresx[i])));
        }
        System.out.println("\n"+B1+" + "+B0);
    }

}