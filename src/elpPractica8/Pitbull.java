package elpPractica8;

public class Pitbull extends Dog{
private String color,tamanio;

Pitbull(String nombre,String raza, int edad,String color, String tamanio) {
        super(nombre,raza,edad);
        this.color=color;
        this.tamanio=tamanio;
        }

public void realizarActividad(){
    System.out.println("Estas en Pitbull");
}

public void informacionExtra(){
    System.out.println("El Pitbull es un perro de caza");
}
}