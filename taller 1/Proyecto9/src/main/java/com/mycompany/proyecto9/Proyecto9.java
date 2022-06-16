/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto9;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto9 {

    public static void main(String[] args) {
        double A[]= new double[4];
        double Menor,Nota;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Escribe la nota "+(i+1)+":");
            A[i]= sc.nextDouble();
        }
        
        Menor=A[0];
        
        for (int i = 0; i < A.length; i++) {
            if(A[i]<Menor){
                Menor= A[i];
            }
        }
        Nota=(A[0]+A[1]+A[2]+A[3]-Menor)/3;
        System.out.println("Su promedio de practicas es: "+Nota);
    }
}
