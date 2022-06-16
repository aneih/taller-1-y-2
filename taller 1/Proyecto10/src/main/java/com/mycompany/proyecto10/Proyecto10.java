/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto10;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto10 {

    public static void main(String[] args) {
        int A[]= new int[3];
        int Mayor;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Escribe el lado numero "+(i+1)+":");
            A[i]= sc.nextInt();
        }
        
        Mayor=A[0];
        
        for (int i = 0; i < A.length; i++) {
            if(A[i]>Mayor){
                Mayor= A[i];
            }
        }
        if (Mayor<((A[0]+A[1]+A[2])-Mayor)) {
            if (A[0]==A[1]&&A[0]==A[2]) {
                System.out.println("Es un triangulo equilatero");
            }
            else if (A[0]!=A[1]&&A[0]!=A[2]&&A[1]!=A[2]) {
                System.out.println("Es un triangulo escaleno");
            }
            else {
                System.out.println("Es un triangulo isósceles");
            }
        }
        else {
            System.out.println("No puede ser un triangulo");
        }

    }
}
