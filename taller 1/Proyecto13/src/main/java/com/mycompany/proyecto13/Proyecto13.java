/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto13;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[]= new int[4];
        for (int i = 0; i < N.length; i++) {
            System.out.println("Escribe el numero "+(i+1)+":");
            N[i]= sc.nextInt();
        }
        
        int mem;
        
        for (int j = 0; j < N.length; j++) {
            for (int i = 0; i < N.length-1; i++) {
                if (N[i]>N[i+1]) {
                    mem=N[i];
                    N[i]=N[i+1];
                    N[i+1]=mem;
                }
                
            }
            
        }
        
        System.out.println("El orden ascendente es");
        for (int i = 0; i < N.length; i++) {
            System.out.println(N[i]);
            
        }
    }
}
