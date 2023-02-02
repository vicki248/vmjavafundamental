package com.juaracoding.vmjavafundamental.testharian.praktikum_4;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 30/01/2023 22:16
@Last Modified 30/01/2023 22:16
Version 1.1
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum4 {
        /*
	            Soal Nomor 2 Praktikum 4 Java Fundamental
        */
        static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int intPilih;
        while (true) {
                System.out.println("Pilih Method:");
                System.out.println("1. Hitung Luas Lingkaran");
                System.out.println("2. Hitung Luas Persegi Panjang");
                System.out.println("3. Hitung Luas Persegi");
                System.out.println("4. Hitung Luas Segitiga");
                System.out.println("5. Hitung Luas Belah Ketupat");
            try {
                System.out.print("Silahkan Pilih Menu : ");
                intPilih = input.nextInt();
                switch (intPilih) {
                    case 1:
                        System.out.println("Luas Lingkaran");
                        luasLingkaran();
                        break;
                    case 2:
                        System.out.println("Luas Persegi Panjang");
                        luasPersegiPanjang();
                        break;
                    case 3:
                        System.out.println("Luas Persegi");
                        luasPersegi();
                        break;
                    case 4:
                        System.out.println("Luas Segitiga");
                        luasSegitiga();
                        break;
                    case 5:
                        System.out.println("Luas Belah Ketupat");
                        luasBelahKetupat();
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        continue;
                }
            }catch (InputMismatchException e) {
                System.out.println("Input harus angka");
                input.nextLine();
                continue;
            }
            System.out.println("Apakah anda ingin memilih menu lain? (Y/N)");
            String strPilihanLanjut = input.next();
            if (!strPilihanLanjut.equalsIgnoreCase("Y")){
                break;
            }
        }
    }

    private static void luasLingkaran() {
            System.out.print("Masukkan jari-jari: ");
            double douR = input.nextDouble();
            double douLuas = Math.PI * douR * douR;
            System.out.println("Anda menghitung luas lingkaran dengan input jari-jari adalah " + douR + " cm" + " Luas lingkaran adalah " + douLuas);
    }

    private static void luasPersegiPanjang() {
            System.out.print("Masukkan Panjang: ");
            double douPanjang = input.nextDouble();
            System.out.print("Masukkan Lebar: ");
            double douLebar = input.nextDouble();
            double douLuas = douPanjang * douLebar;
            System.out.println("Anda menghitung luas persegi panjang dengan input panjang " + douPanjang + " dan lebar " + douLebar + " Luas persegi panjang adalah " + douLuas);
    }

    private static void luasPersegi() {
            System.out.print("Masukkan sisi: ");
            double douSisi = input.nextDouble();
            double douLuas = douSisi * douSisi;
            System.out.println("Anda menghitung luas persegi dengan input sisi " + douSisi + " Luas persegi adalah " + douLuas);
    }

    private static void luasSegitiga() {
            System.out.print("Masukkan alas: ");
            double douAlas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double douTinggi = input.nextDouble();
            double douLuas = 0.5 * douAlas * douTinggi;
            System.out.println("Anda menghitung luas segitiga dengan input alas " + douAlas + " dan tinggi " + douTinggi + " Luas segitiga adalah " + douLuas);
    }
    private static void luasBelahKetupat() {
            System.out.print("Masukkan diagonal 1: ");
            double douDiagonal1 = input.nextDouble();
            System.out.print("Masukkan diagonal 2: ");
            double douDiagonal2 = input.nextDouble();
            double douluas = 0.5 * douDiagonal1 * douDiagonal2;
            System.out.println("Anda menghitung luas belah ketupat dengan input diagonal 1 " + douDiagonal1 + " dan diagonal 2 " + douDiagonal2 + " Luas belah ketupat adalah " + douluas);
    }
}
