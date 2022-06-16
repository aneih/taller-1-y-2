/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller26;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Taller26 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        
        System.out.println("Escriba la frase");
         
        
        String frase=sc.nextLine(); 
         
        
        char caracteres[]=frase.toCharArray();
         
        
        for(int i=0;i<frase.length();i++){
            System.out.println(caracteres[i]);
        }
         
    }
}

