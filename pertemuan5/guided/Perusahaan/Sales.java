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
public class Sales extends Pegawai{
    // variabel hanya dapat diakses di kelas ini aja karena private
    private int jmlh_plggn;
    private double komisi;
    //Parameter set mengmabil variabel dari induk dan diubah ke variabel kelas ini
    public void setSales (String nama, String nip, String alamat, int thn_masuk, double gaji_pokok, int jmlh_plggn){      
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.thn_masuk = thn_masuk;
        this.gaji_pokok = gaji_pokok;
        this.jmlh_plggn = jmlh_plggn;
        
        komisi  = 50000 * jmlh_plggn; // menghitung komisi yg didapat selse
        gaji_akhir = gaji_pokok + komisi; // menghitung gaji_akhir / total gaji
    }

    public void cetakSales(){ // menampilkan hasil / output
        System.out.println("=== DATA SALES ===");
        super.cetak();
        System.out.println("Jumlah Pelanggan : "+jmlh_plggn);
        System.out.println("Komisi           : "+komisi);
        System.out.println("Gaji Akhir        :  "+gaji_akhir);
    }
}
