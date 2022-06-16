/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto11;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto11 {

    public static void main(String[] args) {
        int N[]= new int[3];
        int Mayor,Menor,Medio;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N.length; i++) {
            System.out.println("Escribe el numero "+(i+1)+":");
            N[i]= sc.nextInt();
        }
        
        Mayor=N[0];
        for (int i = 0; i < N.length; i++) {
            if(N[i]>Mayor){
                Mayor= N[i];
            }
        }
        
        Menor=N[0];
        for (int i = 0; i < N.length; i++) {
            if(N[i]<Menor){
                Menor= N[i];
            }
        }
        
        Medio=N[0];
        for (int i = 0; i < N.length; i++) {
            if(N[i]!=Menor && N[i]!=Mayor){
                Medio= N[i];
            }
        }
        
        System.out.println("Mayor a menor: "+Mayor+" "+Medio+" "+Menor);
        System.out.println("Menor a mayor: "+Menor+" "+Medio+" "+Mayor);      
    }
}
