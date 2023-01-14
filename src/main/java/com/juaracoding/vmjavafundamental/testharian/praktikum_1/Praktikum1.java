package com.juaracoding.vmjavafundamental.testharian.praktikum_1;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 14/01/2023 17:44
@Last Modified 14/01/2023 17:44
Version 1.1
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String strInput = sc.nextLine();

        char chX = 'I';
        int intX = 0;
        int intJumlah = 0;
        for (int i=0; i<strInput.length(); i++)
        {
            chX = strInput.charAt(i);
            intX = chX;
            if ((intX>=32 && intX<=47) || (intX>=48 && intX<=57) || (intX>=64 && intX<=90))
            {
                intJumlah=intJumlah+intX;
            }
            System.out.println("INDEX KE-"+i+" ADALAH HURUF "+strInput.charAt(i));
        }
        System.out.println("Hasil : "+intJumlah);
    }
}
