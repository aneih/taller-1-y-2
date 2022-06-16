/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto16;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto16 {

    public static void main(String[] args) {
        double s,d,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el monto del sueldo");
        s=sc.nextInt();
        
        if (s>2000) {
            d=s*3/100;
            t=s-d;
            System.out.println("Descuento de: "+d+" y Sueldo neto de: "+t);
        }
        if (s>1000 && s<2000) {
            d=s*5/100;
            t=s-d;
            System.out.println("Descuento de: "+d+" y Sueldo neto de: "+t);
        }
        if (s<1000) {
            d=s*10/100;
            t=s-d;
            System.out.println("Descuento de: "+d+" y Sueldo neto de: "+t);
        }
    }
}
