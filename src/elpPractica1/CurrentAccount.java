package elpPractica1;

public class CurrentAccount extends Account{

    private double theOverdraftLimit;

    CurrentAccount(double theNumber, double theBalance,double theOverdraftLimit) {
        super(theNumber, theBalance);
        this.theOverdraftLimit=theOverdraftLimit;
    }

    public double getTheOverdraftLimit() {
        return theOverdraftLimit;
    }

    public void setTheOverdraftLimit(double theOverdraftLimit) {
        this.theOverdraftLimit = theOverdraftLimit;
    }

}