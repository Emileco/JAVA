package Proyecto;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {



public static void main(String[] args) {
// TODO Auto-generated method stub

int tamaño, cont = 0 , i;



ArrayList <String> list = new ArrayList <String>();
list = ManejoDatos.regresaArrayList("/home/ic20elp/Downloads/tweets.csv");
list = ManejoDatos.quitarcasos(list);
for(String txt: list)
System.out.println(txt);
}
}