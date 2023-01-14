package com.juaracoding.vmjavafundamental.testharian.testarray.testarray;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 13/01/2023 15:58
@Last Modified 13/01/2023 15:58
Version 1.1
*/

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : " );
        String strInput = sc.nextLine();

    /*
    int intX = charYgTadi;
    if((intX>=65 && intX<=90) || (intX>=97 && intX<=122) || (intX>=48 && intX<=57)){
    true
    }

     */
        char chX = 'I';
        int intX = 0;
        int intJumlah =0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if((intX>=65 && intX<=90) || (intX>=97 && intX<=122))
            {
                intJumlah=intJumlah+intX;
            }
            System.out.println("INDEX KE"+i+" ADALAH HURUF "+strInput.charAt(i));
        }
        System.out.println("Hasil : "+intJumlah);
    }
}
