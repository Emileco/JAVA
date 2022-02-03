package elpPractica1;


public class DepositAccount extends Account{

    // Atributos
    private double theInterestRate;
    

    DepositAccount(double theNumber, double theBalance, double theInterestRate) {
        super(theNumber, theBalance);
        this.theInterestRate=theInterestRate;
    }
    
    //Constructor
    

    public double getTheInterestRate() {
        return theInterestRate;
    }

   
}