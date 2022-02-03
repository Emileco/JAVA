package elpPractica1;

public class Deudas extends Account{

    private double deuda;
    Deudas(double theNumber, double theBalance,double deuda) {
        super(theNumber, theBalance);
        this.deuda=deuda;
    }

    public double getDeuda() {
        return deuda;
    }
}