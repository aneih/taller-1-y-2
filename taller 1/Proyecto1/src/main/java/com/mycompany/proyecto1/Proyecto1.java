/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1;

import java.util.Scanner;


public class Proyecto1 {

    public static void main(String[] args) {
        int A,B,C;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero:");
        A= sc.nextInt();
        System.out.println("Escribe el segundo numero:");
        B= sc.nextInt();
        System.out.println("Escribe el tercer numero:");
        C= sc.nextInt();
        
        
        if(A>B && A>C){
                System.out.print(A+" es el numero mayor y ");
                if(B<C){
                    System.out.println(B+" es el numero menor");
                }
                else {
                    System.out.println(C+" es el numero menor");
                }
        }
        if(B>A && B>C){
                System.out.print(B+" es el numero mayor y ");
                if(A<C){
                    System.out.println(A+" es el numero menor");
                }
                else {
                    System.out.println(C+" es el numero menor");
                }
        }
        if(C>A && C>B){
                System.out.print(C+" es el numero mayor y ");
                if(A<B){
                    System.out.println(A+" es el numero menor");
                }
                else {
                    System.out.println(B+" es el numero menor");
                }
        }
        
        
    }
}
