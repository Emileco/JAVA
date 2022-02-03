package elpPractica8;

public class HuskySiberiano extends Dog{
private String color,tamanio;

HuskySiberiano(String nombre,String raza, int edad,String color, String tamanio) {
        super(nombre,raza,edad);
        this.color=color;
        this.tamanio=tamanio;
        }

public void realizarActividad(){
    System.out.println("Estas en Husky");
}

public void informacionExtra(){
    System.out.println("El Husky es un perro muy amigable");
}
}

