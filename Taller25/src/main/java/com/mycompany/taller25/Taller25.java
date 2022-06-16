/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller25;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Taller25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        char mayusculas[] = new char[26];

        int j=0;
        for (int i = 65; i <=90; i++) {
            mayusculas[j] = (char) i;
            j++;
              
        }
 
        String cadena = "";
        int eleccion = -1;
 
        do {
            System.out.println("Elija un letra entre 0 y " + 25);
            eleccion = sc.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= 25)) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }
 
        } while (eleccion != -1);
 
        System.out.println(cadena);
 
    }
 
}
    

