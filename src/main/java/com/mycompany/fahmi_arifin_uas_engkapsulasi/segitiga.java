/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fahmi_arifin_uas_engkapsulasi;

/**
 *
 * @author ASUS
 */
public class segitiga {
      private int alas;
private int tinggi;
public int getTinggi () {
        return tinggi;
}
public void setTinggi (int tinggi) {
    this.tinggi = tinggi;
}
public int getAlas () {
    return alas;
}
public void setAlas (int alas) {
    this.alas = alas;
}
public segitiga () {
    int t= 0;
    int a= 0;
}
public int luas (int a, int t) {
return a*t/2;    
}
public int getLuas () {
    return luas(alas, tinggi);
}
}

