/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.Perusahaan;

/**
 *
 * @author Asus
 */
public class Manager extends Pegawai {
    // private hanya dapat diakses dikelas ini aja 
    private String divisi;
    private double tunjangan_jabatan;

    // menggunakan Parameter set mengmabil variabel dari induk dan diubah ke variabel kelas ini
    public void setManager (String nama, String nip, String alamat, int thn_masuk, double gaji_pokok, String divisi){      
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.thn_masuk = thn_masuk;
        this.gaji_pokok = gaji_pokok;
        this.divisi = divisi;

        //mencari berpa lama karyawaan bekerja dengan percabangan if else
        if(2015 - thn_masuk >= 3 && 2015 - thn_masuk <5){
            tunjangan_jabatan = 0.05 * gaji_pokok;
        }else if ( 2015 - thn_masuk >= 5 ){
            tunjangan_jabatan = 0.1 * gaji_pokok;
        }
        
        //menghitung total gaji / gaji akhir
        gaji_akhir = gaji_pokok + tunjangan_jabatan;
    }
    
    
    public void cetakManager(){ // menampilkan hasil data manager
        System.out.println("=== DATA MANAGER ==="); 
        super.cetak();
        System.out.println("Tunjangan Jabatan : "+tunjangan_jabatan);
        System.out.println("Total Gaji        : "+gaji_akhir);
    }
}
