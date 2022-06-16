/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto4;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto4 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero");
        N=sc.nextInt();
        if (N%2==0) {
            System.out.println("Es un numero par");
        }
        else {
            System.out.println("Es un numero impar");
        }
        
    }
}
