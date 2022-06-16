/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto5;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto5 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        a=sc.nextInt();
        System.out.println("Escribe el segundo numero");
        b=sc.nextInt();
        if (a>b) {
            System.out.println("De menor a mayor son "+b+" "+a);
        }
        if (a<b) {
            System.out.println("De menor a mayor son "+a+" "+b);
        }
        else {
            System.out.println("Son iguales "+a+" y "+b);
        }
        
    }
}
