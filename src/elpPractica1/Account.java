package elpPractica1;

public class Account {
    
        //Atributos
        private double theNumber;
        private double theBalance;

        //Constructor

        Account(double theNumber,double theBalance){
            this.theBalance=theBalance;
            this.theNumber=theNumber;
        }

        //Metodos

        public void credit(){
            System.out.println("Estas en credito");
        }

        public void debit(){

        }

        public void getBalance(){
            
        }

    public double getTheBalance() {
        return theBalance;
    }


}