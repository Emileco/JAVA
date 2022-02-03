package elpPractica8;

public class Dog{
    private String nombre,raza;
    private int edad;

    Dog(String nombre, String raza, int edad){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
    }

    public void realizarActividad(){
        System.out.println("Estas en Dog");
    }
}