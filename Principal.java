package Proyecto;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.javafx.tools.packager.Main;



public class Principal extends Grafico {
    ArrayList<String> listDatos = new ArrayList<String>();
    ArrayList <String> listPalabras = new ArrayList <String>();
    ArrayList <Integer> listConteo = new ArrayList <Integer>();
    int tamaño, i;

/** 
 * @param args
 */
public static void main(String[] args) {
// TODO Auto-generated method stub
    Grafico.launch();
}


public void OrdenadorDatos (){
    this.listDatos = ManejoDatos.regresaArrayList("/home/ic20elp/Downloads/tweets.csv");
    this.listPalabras = ManejoDatos.regresaArrayList("/home/ic20elp/POO/Practica1/Practica1/src/Proyecto/Prueba.txt");
    this.listDatos = ManejoDatos.quitarcasos(this.listDatos);
    this.listConteo = ManejoDatos.quitarPalabras(this.listDatos, this.listPalabras);
    for(String txt: this.listDatos)
        System.out.println(txt);

    for(Integer num: listConteo)
    {
        System.out.println(""+listPalabras.get(this.i)+" : "+num);
        this.i++;
    }
}

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getList() {
        return listDatos;
    }

    
    /** 
     * @param listDatos
     */
    public void setList(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getList2() {
        return listPalabras;
    }

    
    /** 
     * @param listPalabras
     */
    public void setList2(ArrayList<String> listPalabras) {
        this.listPalabras = listPalabras;
    }

    
    /** 
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> getCont() {
        return listConteo;
    }

    
    /** 
     * @param listConteo
     */
    public void setCont(ArrayList<Integer> listConteo) {
        this.listConteo = listConteo;
    }

    
    /** 
     * @return int
     */
    public int getTamaño() {
        return tamaño;
    }

    
    /** 
     * @param tamaño
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

    