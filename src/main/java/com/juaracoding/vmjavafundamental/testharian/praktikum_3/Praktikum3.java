package com.juaracoding.vmjavafundamental.testharian.praktikum_3;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 22/01/2023 23:03
@Last Modified 22/01/2023 23:03
Version 1.1
*/

import java.util.Scanner;

public class Praktikum3 {
    /*
	Soal Nomor 1 Praktikum 3 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan jumlah detik: ");
            String input = scanner.nextLine();
            try {
                int detik = Integer.parseInt(input);
                int jam = detik / 3600;
                int sisaDetik = detik % 3600;
                int menit = sisaDetik / 60;
                sisaDetik = sisaDetik % 60;
                System.out.println(detik + " detik sama dengan " + jam + " jam " + menit + " menit " + sisaDetik + " detik");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Masukkan hanya bisa di isi dengan angka!!!");
            }
        }
    }
}
