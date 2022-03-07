package elpPractica10;

public class promedio{
    
    public double promedioX(double valores[]){
        double promedio,suma=0;
        int i;
        for (i = 0; i < valores.length; i++) {
            suma+=valores[i];
        }
        promedio = suma/valores.length;
        return promedio;
    }

}