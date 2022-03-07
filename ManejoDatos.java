package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejoDatos {


    public static ArrayList<String> regresaArrayList(String ruta){
        ArrayList <String> list = new ArrayList <String>();
        try {
        Scanner csvData = new Scanner(new File(ruta));
        while(csvData.hasNext()) {
        list.add(csvData.nextLine());
        }
        
        }catch(FileNotFoundException ex) {
        System.out.println(ex.toString());
       }
       return list;
    }


public static ArrayList<String> quitarcasos(ArrayList<String> list)
{
    ArrayList <String> list2 = new ArrayList <String>();
    int tamanio;
    String aux;
    tamanio=list.size();

    for (int i = 0; i < tamanio; i++) {
        aux=(list.get(i).replaceAll("\\d",""));
        aux=(aux.replaceAll("\\W"," "));
        list2.add(aux);
    }
        return list2;
    
}
}