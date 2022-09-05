/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.Perusahaan;

/**
 *
 Nama : Diptya Bagus Sumantry
 NIM  : 20102281
 Kelas: S1-IF-08-R
 * @author Asus
 */
public class Pegawai { //kelas induk
    protected int thn_masuk; 
    protected String nip,nama, alamat;
    protected double gaji_pokok,gaji_akhir;
    
    public void cetak (){ //kelas cetak / output
        System.out.println("Nama                : "+nama);
        System.out.println("Nomer Induk Pegawai : "+nip);
        System.out.println("Alamat              : "+alamat);
        System.out.println("Tahun Masuk Kerja   : "+thn_masuk);
        System.out.println("Gaji Pokok          : "+gaji_pokok);
    }
}
