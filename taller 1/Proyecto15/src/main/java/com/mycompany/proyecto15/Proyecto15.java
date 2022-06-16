/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto15;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto15 {

    public static void main(String[] args) {
        int t=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrase los valores");
        for (int i = 0; i < 10; i++) {
            n=sc.nextInt();
            t+=n;
            
        }
        t=t/10;
        System.out.println("El promedio es : "+t);
    }
}
