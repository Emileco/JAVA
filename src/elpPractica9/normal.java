package elpPractica9;

public class normal {
    private double media;
    private double desviacionE;
    double areaTot=0, fX=0;

    /**
     * Constructor
     * @param media
     * @param desviacionE
     */
    normal(double media, double desviacionE){
        this.media=media;
        this.desviacionE=desviacionE;
    }


    public void calcularPrFDN(double limiteInferior, double limiteSuperior, double delta){
        double i;
        for (i = limiteInferior; i < limiteSuperior; i+=delta) {
            this.calcularVFDN(i);
            this.areaTot += (this.fX*delta);
        }
    }

    public void calcularVFDN(double x){
        if(desviacionE==0)
        {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        else{
        this.fX = (1/(this.desviacionE*(Math.sqrt(2*Math.PI))))*Math.exp(-0.5*((Math.pow((x-this.media),2))/(Math.pow(this.desviacionE, 2)))); 
        }
    }
}
