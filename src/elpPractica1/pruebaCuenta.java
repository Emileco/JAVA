package elpPractica1;

public class pruebaCuenta{
    public static void main(String[]args) {
        DepositAccount cuenta1 = new DepositAccount(23.4, 4545.6, 56.7);
        System.out.println("El valor del balance es: "+cuenta1.getTheBalance());

        Deudas cuenta2 = new Deudas(23.4, 45.6, 57.98);
        System.out.println("El valor de la deuda es: "+cuenta2.getDeuda());
    }
}