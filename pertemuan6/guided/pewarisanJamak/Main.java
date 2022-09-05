/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan7.guided.pewarisanJamak;

/**
 *
 * @author Asus
 */
public class Main {
     public static void main(String[] args) {
    MiniBus miniBus = new MiniBus ("Pribadi", " D 1 PYA", "Avanza", 1300, "Alarm Alert", " AC & wifi " ,  100000, 4, 10);   
        miniBus.tampilInfo();
        System.out.println("Pajak: RP." + miniBus.hitungPajak());
    }
}
