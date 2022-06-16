/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto12;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto12 {

    public static void main(String[] args) {
        double p,d,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el monto de la compra");
        p=sc.nextInt();
        
        if (p>100) {
            d=p*10/100;
            t=p-d;
            System.out.println("Debes pagar: "+t);
        }
        else if (p<=100 && p>50) {
            d=p*2/100;
            t=p-d;
            System.out.println("Debes pagar: "+t);
        }
        else {
            System.out.println("Lo sentimos pero debes pagar lo mismo: "+p);
        }
    }
}
