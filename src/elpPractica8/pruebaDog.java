package elpPractica8;

import java.io.IOException;

public class pruebaDog {
    public static void main(String[] args) throws NumberFormatException, IOException{
    Dog dg = new Dog("Whisky", "Pastor", 18);
    dg.realizarActividad();
    HuskySiberiano hs = new HuskySiberiano("Lucas", "Siberiano", 1, "Negro con blanco", "Grande");
    hs.realizarActividad();
    Pitbull pt = new Pitbull("Toby", "Americano", 2, "Blanco", "Mediano");
    pt.realizarActividad();
    }
}