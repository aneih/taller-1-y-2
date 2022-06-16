/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto14;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto14 {

    public static void main(String[] args) {
        int l;
        double p;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Que opcion va a realizar:
                           1.Calcula el perimetro de un cuadrado 
                           2.Calcula el perimetro de un trianngulo equilatero
                           3.Calcula el perimetro de un circulo
                           """);
        l=sc.nextInt();
        switch (l) {
            case 1 -> {
                System.out.println("Inserte el valor del lado");
                l=sc.nextInt();
                p=l*4;
                System.out.println("El perimetro es "+p);
            }
            case 2 -> {
                System.out.println("Inserte el valor del lado");
                l=sc.nextInt();
                p=l*3;
                System.out.println("El perimetro es "+p);
            }
            case 3 -> {
                System.out.println("Inserte el valor del diametro");
                l=sc.nextInt();
                p=Math.PI*l;
                System.out.println("El perimetro es "+p);
            }    
            default -> System.out.println("Error valor no correcto");
                    
        }
    }
}
