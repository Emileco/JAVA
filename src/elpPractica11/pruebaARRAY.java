package elpPractica11;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class pruebaARRAY {



public static void main(String[] args) {
// TODO Auto-generated method stub

int tamaño, cont = 0 , i;



ArrayList <String> list = new ArrayList <String>();
ArrayList <String> list2 = new ArrayList <String>();
list = Validar.regresaArrayList("/home/ic20elp/Downloads/tweets.csv");
list = Validar.quitarcasos(list);
list = Validar.etiquetas(list);
list2= Validar.regresaArrayList("/home/ic20elp/POO/Practica1/Practica1/src/elpPractica11/Palabras.txt");
list = Validar.quitarPalabras(list,list2);
for(String txt: list)
System.out.println(txt);
/*
tamaño = list.size();

System.out.println("El ultimo elemento es: "+list.get(tamaño-1));

String cadena = "ham,\"I am sorry it hurt you.,\",";

for(i=0; i< tamaño; i++) {
if(cadena.equals(list.get(i))) {
cont++;
System.out.println("Coincide en : "+i);

}
}

System.out.println("El numero de coincidencias es: "+cont);


*/
}



}