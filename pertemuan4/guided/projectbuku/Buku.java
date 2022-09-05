/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan5.guided.projectbuku;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Buku {
// Membuat Variabel sesuai tipe data
    String pengarang;
    String judul;
    int jumlahHalaman;
    float diskon;
    double harga;
    
    //get, fungsi accessor
    public String getPengarang() {
        return pengarang;
    }
    
    //set, fungsi mutator
    public void setPengarang (String pengarang) {
        this.pengarang = pengarang;
    }
     //set, fungsi accessor
    public String getJudul() {
        return judul;
    }
    //set, fungsi mutator
    public void setJudul(String judul) {
        this.judul = judul;
    }


//set, fungsi accessor   
 public int getJumlahHalaman() {
        return jumlahHalaman;
    }
//set, fungsi mutator
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
//set, fungsi accessor   
    public float getDiskon() {
        return diskon;
    }
//set, fungsi mutator
    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }
//set, fungsi accessor   
    public double getHarga() {
        return harga;
    }
//set, fungsi mutator
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setInfo(float diskon, double harga) { //dapat diaskes kelas lain
         this.diskon = diskon; // this.diskon vairabel pada setInfo
         this.harga = harga - (harga*diskon); //melakukan oprasi perkalian dan pengurangan pada this.harga pada setInfo
    }
    public void setInfo(double harga) { //dapat diakses kelas lain
        this.diskon = 0.1f; // this.diskon pada setInfo = 0.1f
        this.harga = harga - (harga*this.diskon); // melakukan perkalian dan pengurangan
    }
    public void cetak(){ // untuk menampilkan hasil
            System.out.println("Judul Buku: "+ getJudul()); //menampilkan judul
            System.out.println("Pengarang Buku: "+ getPengarang()); //menampilkan pengarang
            System.out.println("Jumlah Halaman Buku: " + getJumlahHalaman() + " halaman"); // menampilkan jumlah halaman
            System.out.println("Diskon Buku: " + getDiskon()); //menampilkan diskon
            System.out.println("Harga Buku: " + getHarga()); //menampilkan harga
            System.out.println("");
    }
}


