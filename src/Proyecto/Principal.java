package Proyecto;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {



public static void main(String[] args) {
// TODO Auto-generated method stub

int tamaño, i=0;



ArrayList <String> list = new ArrayList <String>();
ArrayList <String> list2 = new ArrayList <String>();
ArrayList <Integer> cont = new ArrayList <Integer>();
list = ManejoDatos.regresaArrayList("/home/ic20elp/Downloads/tweets.csv");
list2 = ManejoDatos.regresaArrayList("/home/ic20elp/POO/Practica1/Practica1/src/Proyecto/Prueba.txt");
list = ManejoDatos.quitarcasos(list);
cont = ManejoDatos.quitarPalabras(list, list2);
for(String txt: list)
System.out.println(txt);

for(Integer num: cont)
{
System.out.println(""+list2.get(i)+" : "+num);
i++;
}
}
}