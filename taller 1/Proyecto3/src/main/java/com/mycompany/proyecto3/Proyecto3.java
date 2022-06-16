/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto3;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto3 {

    public static void main(String[] args) {
        double R,H,A,V;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el Radio");
        R= sc.nextInt();
        System.out.println("Escribe la altura");
        H= sc.nextInt();
        A=(2*Math.PI*R*H)+(2*Math.PI*(R*R));
        V=(Math.PI*R*R)*H;
        System.out.println("El area es "+A);
        System.out.println("El Volumen es "+V);
    }
}
