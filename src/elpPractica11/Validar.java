package elpPractica11;



import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Validar {



public Validar() {
// TODO Auto-generated constructor stub
}

/**
 * Guarda un texto en un arraylist
 * @param ruta
 * @return list
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
 * Quita los caracteres especiales y numeros de un texto
 * @param list
 * @return list2
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
        aux=(aux.replaceAll("mo[\\w]*", ""));
        list2.add(aux);
    }
        return list2;
    
}



public static ArrayList<String> etiquetas(ArrayList<String> list)
{
    ArrayList <String> list2 = new ArrayList <String>();
    int tamanio;
    String texto;
    boolean aux;
    tamanio=list.size();

    for (int i = 0; i < tamanio; i++) {
        if((list.get(i).contains("I am"))==true){
            texto="FEEL1|";
            texto=texto.concat(list.get(i));
            list2.add(texto);
        }
        else if((list.get(i).contains("is not"))==true){
            texto="FEEL2|";
            texto=texto.concat(list.get(i));
            list2.add(texto);
        }
        else if((list.get(i).contains("to the"))==true){
            texto="FEEL3|";
            texto=texto.concat(list.get(i));
            list2.add(texto);
        }
        else{
            texto="NOTHING|";
            texto=texto.concat(list.get(i));
            list2.add(texto);
        }
    }
        return list2;
}


public static ArrayList<String> quitarPalabras(ArrayList<String> list,ArrayList<String> list2){
//    ArrayList <String> list2 = new ArrayList <String>();
    ArrayList <String> list3 = new ArrayList <String>();
    int tamanio,tamanio2;
    String aux;
  //  list2=regresaArrayList(ruta); 
    tamanio=list.size();
    tamanio2=list2.size();
    for (int i = 0; i < tamanio; i++) {
        aux=list.get(i);
       for (int j = 0; j < tamanio2; j++) {
           if(list.get(i).contains(list2.get(j))==true){
               aux=aux.replaceAll(list2.get(j),"");
           }
       } 
       list3.add(aux);
    }
    return list3;
    
}
}
