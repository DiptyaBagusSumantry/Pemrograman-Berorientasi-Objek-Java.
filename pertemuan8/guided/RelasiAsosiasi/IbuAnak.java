/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan9.guided.RelasiAsosiasi;

/**
 *
 * @author Asus
 */
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia ("Budi", 30);
        Manusia anak1 = new Manusia ("Ani", 4);
        Manusia ibu2 = new Manusia ("Diana", 40);
        Manusia anak2 = new Manusia ("Andi", 5, ibu2);
        
        System.out.println("=========================");
        ibu1.cetak();
        anak1.cetak();
        System.out.println("=========================");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        System.out.println("=========================");
        ibu2.cetak();
        anak2.cetak();
        
    }
}
