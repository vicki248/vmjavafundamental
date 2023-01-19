package com.juaracoding.vmjavafundamental.testharian.praktikum_2;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 19/01/2023 11:45
@Last Modified 19/01/2023 11:45
Version 1.1
*/

import java.util.Scanner;

public class Praktikum2 {
        /*
	            Soal Nomor 2 Praktikum 2 Java Fundamental
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan : ");
        String strNamaDepan = sc.nextLine();
        System.out.print("Masukkan Nama Belakang : ");
        String strNamaBelakang = sc.nextLine();

        char inisialNamaDepan = strNamaDepan.toUpperCase().charAt(0);
        char inisialNamaBelakang = strNamaBelakang.toUpperCase().charAt(0);
        String strInisial = inisialNamaDepan+""+inisialNamaBelakang;
        String strNamaLengkap = strNamaDepan+" "+strNamaBelakang+" ";

        System.out.println("Inisial "+strNamaLengkap+"adalah "+strInisial);
    }
}
