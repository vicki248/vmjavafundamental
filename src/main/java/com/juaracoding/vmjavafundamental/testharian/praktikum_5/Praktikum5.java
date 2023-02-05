package com.juaracoding.vmjavafundamental.testharian.praktikum_5;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 04/02/2023 23:54
@Last Modified 04/02/2023 23:54
Version 1.1
*/

import java.util.Scanner;

public class Praktikum5 {
    /*
	Soal Nomor 1 Praktikum 5 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
        System.out.print("Tentukan tinggi dari segitiga : ");
        int intTinggi = scan.nextInt();
        for (int i = 1; i <= intTinggi; i++) {
            for (int j = 1; j <= intTinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
            System.out.print("Ingin mengulang lagi?(Y/N)");
            String ulangi = scan.next();
            if(!ulangi.equalsIgnoreCase("y")) {
            ulang = false;
            }
        }
    }
}
