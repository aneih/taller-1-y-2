/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto6;

import java.util.Scanner;

/**
 *
 * @author Master PC
 */
public class Proyecto6 {

    public static void main(String[] args) {
        double kh,ms;
        Scanner sc = new Scanner(System.in);
        System.out.println("A cuantos kilometros por hora va el automovil?");
        kh=sc.nextInt();
        ms=kh/3.6;
        System.out.printf("Va a: %.2f",ms);
        System.out.println(" m/s");
    }
}
