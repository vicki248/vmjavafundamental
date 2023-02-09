package com.juaracoding.vmjavafundamental.testharian.praktikum_6;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 07/02/2023 22:52
@Last Modified 07/02/2023 22:52
Version 1.1
*/

import java.util.Scanner;

public class Praktikum6 {
         /*
	        Soal Nomor 2 Praktikum 6 Java Fundamental
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intAngka = new int[100];
        int intHitung = 0;
        boolean isUlang = true;
        while (isUlang) {
            System.out.print("Masukkan angka: ");
            while (sc.hasNextInt()) {
                intAngka[intHitung] = sc.nextInt();
                intHitung++;
                System.out.print("Masukkan angka: ");
            }
            sc.next();
            boolean isCari = true;
            while (isCari) {
                System.out.print("Masukkan angka yang ingin dicari: ");
                int intCari = sc.nextInt();
                int intIndex = cariIndex(intAngka, intHitung, intCari);
                if (intIndex == -1) {
                    System.out.println("Angka " + intCari + " tidak ditemukan pada data hasil inputan sebelumnya.");
                } else {
                    System.out.print("Angka yang anda input adalah: ");
                    for (int i = 0; i < intHitung; i++) {
                        System.out.print(intAngka[i]);
                        if (i < intHitung - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    System.out.println("Angka yang dicari adalah: " + intCari);
                    System.out.println("Angka " + intCari + " ditemukan pada index ke " + intIndex + " urutan ke " + (intIndex + 1) + " dari data yang diinput.");
                }
                System.out.print("Ingin mencari lagi?(Y/N)");
                String strUlangi = sc.next();
                if (!strUlangi.equalsIgnoreCase("y")) {
                    isCari = false;
                }
            }
            System.out.println("Ingin mengulang program?(Y/N)");
            String strUlang = sc.next();
            if (!strUlang.equalsIgnoreCase("y")) {
                isUlang = false;
                System.out.println("Terima kasih telah mencoba program Searching Linear");
            }
        }
    }

    private static int cariIndex(int[] intAngka, int intHitung, int intCari) {
        for (int i = 0; i < intHitung; i++) {
            if (intAngka[i] == intCari) {
                return i;
            }
        }
        return -1;
    }
}
