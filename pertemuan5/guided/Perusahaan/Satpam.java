/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.Perusahaan;

/**
 Nama : Diptya Bagus Sumantry
 NIM  : 20102281
 Kelas: S1-IF-08-R
 * @author Asus
 */
public class Satpam extends Pegawai {
    //private hanya bisa diakses dikelas ini aja 
    private int jam_lembur;
    private double bonus;
    
    //Parameter set mengmabil variabel dari induk dan diubah ke variabel kelas ini
    public void setSatpam(String nama, String nip, String alamat, int thn_masuk, double gaji_pokok, int jam_lembur){
       this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.thn_masuk = thn_masuk;
        this.gaji_pokok = gaji_pokok;
        this.jam_lembur = jam_lembur;
        
        bonus = 10000 * jam_lembur; //menghitung bonus
        gaji_akhir = gaji_pokok + bonus; //menghitung gaji akhir atau total gaji
    }

    public void cetakSatpam(){ //menampilkan hasil data satpam /output
        System.out.println("=== DATA SATPAM ===");
        super.cetak();
        System.out.println("Total Jam Lembur : "+jam_lembur);
        System.out.println("Bonus Lemburan : "+bonus);
        System.out.println("Gaji Akhir      : "+gaji_akhir);
        
        
   
    }
}
