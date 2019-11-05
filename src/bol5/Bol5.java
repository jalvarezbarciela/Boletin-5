package bol5;

import java.util.Scanner;

public class Bol5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Conta conta1=new Conta("Pablo","12344556",40000);
        conta1.amosar();
        Conta conta2=new Conta("Luis","1392345",3000);
        System.out.println("Cal e o importe da Transferencia");
        double ingreso=sc.nextDouble();
        conta1.transferencia(conta2, ingreso);
    
    
    }
    
}
