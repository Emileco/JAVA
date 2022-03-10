package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejoDatos {
 /**
  * 
  * @param ruta
  * @return
  */
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



/** 
 * @param list
 * @return ArrayList<String>
 */
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


/** 
 * @param list
 * @param list2
 * @return ArrayList<Integer>
 */
public static ArrayList<Integer> quitarPalabras(ArrayList<String> list,ArrayList<String> list2){
        ArrayList <Integer> listnum = new ArrayList <Integer>();
        int tamanio,tamanio2=0,contador=0;
        tamanio2=list2.size();
        int[] contadores = new int[tamanio2];
        String aux;
      //  list2=regresaArrayList(ruta); 
        tamanio=list.size();
        tamanio2=list2.size();
        for (int i = 0; i < tamanio; i++) {
            aux=list.get(i);
           for (int j = 0; j < tamanio2; j++) {
               if(list.get(i).contains(list2.get(j))==true){
                   contadores[j]+=1;
               }
           } 
        }
        for (int i = 0; i < tamanio2; i++) {
            listnum.add(contadores[i]);
        }

        return listnum;
        
    }
}