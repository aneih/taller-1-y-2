

package com.mycompany.proyecto17;

import java.util.Scanner;


public class Proyecto17 {

    public static void main(String[] args) {
        double p,d,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el monto de la compra");
        p=sc.nextInt();
        
        if (p>=300) {
            d=p*25/100;
            t=p-d;
            System.out.println("Debes pagar: "+t);
        }
        else if (p<300 && p>=150) {
            d=p*20/100;
            t=p-d;
            System.out.println("Debes pagar: "+t);
        }
        else {
            System.out.println("Lo sentimos pero debes pagar lo mismo: "+p);
        }
    }
}
