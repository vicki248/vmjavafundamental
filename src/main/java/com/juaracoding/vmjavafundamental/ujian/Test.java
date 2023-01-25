package com.juaracoding.vmjavafundamental.ujian;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Vicki M a.k.a. Vicki Mantovani
Java Developer
Created on 14/01/2023 19:21
@Last Modified 14/01/2023 19:21
Version 1.1
*/

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int jumlahKarakter = rand.nextInt(13) + 12;
        String strData = "";
        char karakterAwal = (char) (rand.nextInt(26) + 'A');
        strData += karakterAwal;
        char karakterSebelum = karakterAwal;


        for (int i = 1; i < jumlahKarakter; i++) {
            char karakterBaru;
            if (i <= 7) {
                if (karakterSebelum == 'A' || karakterSebelum == 'E' || karakterSebelum == 'I' || karakterSebelum == 'O' || karakterSebelum == 'U') {

                    karakterBaru = (char) (rand.nextInt(21) + 'B');
                } else {

                    karakterBaru = (char) (rand.nextInt(5) + 'A');
                }
            } else {
                karakterBaru = (char) (rand.nextInt(26) + 'A');
            }
            karakterBaru = Character.toLowerCase(karakterBaru);
            strData += karakterBaru;
            karakterSebelum = karakterBaru;
        }

        System.out.println(strData);
    }
}
