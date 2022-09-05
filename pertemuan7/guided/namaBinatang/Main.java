/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.namaBinatang;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Binatang [] peliharaanku = { //membuat Array dari jenis kelas Binatang
            new Burung ("Kakak Tua"),
            new Kambing ("Etawa"),
            new Anjing ("Kintamani"),
            new Kucing ("Anggora")
    };
        
        Binatang kesayangan; //deklarasi kesayangan
        Random pilihan = new Random(); //merandom nama hewan
        
        //kesayangan akan merandom dari array peliharanku
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        
        System.out.println("Binatang kesayangan anda : "+kesayangan); //menampilkn nama hewana secar random
        System.out.println("Suaranya : ");
        kesayangan.suara(); //menampilkan suara dari hewan yang ssudah di random
    }
}
