/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fahmi_arifin_uas_engkapsulasi;

/**
 *
 * @author ASUS
 */
public class Fahmi_Arifin_uas_engkapsulasi {

      public static void main(String[] args) {
       segitiga S = new segitiga();
        S.setAlas(5);    
        S.setTinggi(10);
        System.out.println("Program Segitiga");
        System.out.println("Tugas UAS Fahmi Arifin");
        System.out.println("Alas: " +S.getAlas());
        System.out.println("Tinggi: " +S.getTinggi());
        System.out.print("Luas Segitiga: " +S.getLuas());
    }
    
    }
