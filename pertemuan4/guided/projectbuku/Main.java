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
public class Main {
       public static void main(String[] args) {
        Buku novel, fiksi; //kelas buku mempunyai turunan novel dan fiksi
        
        novel = new Buku(); //novel turunan dari Buku
        fiksi = new Buku(); //Fiksi turunan dari Buku
        
        Scanner inputString = new Scanner(System.in); //digunakan untuk input integer
        Scanner inputBilangan = new Scanner(System.in); //digunakan untuk input string
        //input Judul buku
        System.out.print("Masukkan Judul Buku: "); 
        novel.setJudul(inputString.nextLine());
        //input pengarang
        System.out.print("Masukkan Pengarang: ");
        novel.setPengarang(inputString.nextLine());
        
        novel.setInfo(0.2f, 45000); //memanggil fungsi setInfo pada Buku.java
        //input jumlah halaman
        System.out.print("Masukkan Jumlah Halaman: ");
        novel.setJumlahHalaman(inputBilangan.nextInt());
        
        novel.cetak(); //menampilkan hasil
        //input judul buku
        System.out.print("Masukkan Judul Buku: ");
        fiksi.setJudul(inputString.nextLine());
        //input pengarang
        System.out.print("Masukkan Pengarang: ");
        fiksi.setPengarang(inputString.nextLine());
        
        fiksi.setInfo(45000); //melakukan pemanggilan fungsi setInfo pada Buku.java
        //input jumlah halaman
        System.out.print("Masukkan Jumlah Halaman: ");
        fiksi.setJumlahHalaman(inputBilangan.nextInt());
        
        fiksi.cetak(); //menampilkan output
    }
}

