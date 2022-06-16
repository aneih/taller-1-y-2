/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto8;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto8 {

    public static void main(String[] args) {
        int A,B,C;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero:");
        A= sc.nextInt();
        System.out.println("Escribe el segundo numero:");
        B= sc.nextInt();
        System.out.println("Escribe el tercer numero:");
        C= sc.nextInt();
        
        
        if(A<B && A<C){
                if (B<C) {
                System.out.print(B+" es el numero intermedio");
            }   
                else {
                System.out.print(C+" es el numero intermedio");
                }
        }
        else if(B<A && B<C){
                if (A<C) {
                System.out.print(A+" es el numero intermedio");
                }   
                else {
                System.out.print(C+" es el numero intermedio");
                }
                
        }
        else{
                if (A<B) {
                System.out.print(A+" es el numero intermedio");
                }   
                else{
                System.out.print(B+" es el numero intermedio");
                }
                
        }
    }
}
