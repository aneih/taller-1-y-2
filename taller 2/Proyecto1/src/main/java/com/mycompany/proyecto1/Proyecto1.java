
package com.mycompany.proyecto1;

import java.util.Scanner;


public class Proyecto1 {

    public static void main(String[] args) {
        int N[]= new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los valores");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el "+(i+1)+" numero");
            N[i]=sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("El indice "+i+" es el numero: "+N[i]);
        }
    }
}
