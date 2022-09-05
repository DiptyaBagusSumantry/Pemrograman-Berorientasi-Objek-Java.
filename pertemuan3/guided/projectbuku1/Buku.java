/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan4.guided.projectbuku1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Buku {
    private String judul;
    //private tidak dapat diakses diluar kelas
    private String pengarang;
    //private tidak dapat diakses diluar kelas
    
    public Buku(){
    //public dapat diakses diluar kelas 
        Scanner input = new Scanner (System.in);
        //membuat inputan data sementara menggunakan fungsi scanner
        //String judul,pengarang; 
        
        System.out.print("Judul Buku 1 : ");
        //menampilkan judul buku 1
        judul = input.nextLine();
        //inputan user disimpan sementara
        
        System.out.print("pengarang 1 : ");
        pengarang = input.nextLine();
       // judul = " Tidak Diketahui ";
        //pengarang = "Tidak Diketahui ";
        
        System.out.println("===============");
        
    }
   
    public Buku(String judul, String pengarang){
    //dapat diakses dikelas lain
        this.judul = judul;
        //this.judul variabel beda dengan yang atas, = judul diambil dari parameter
        this.pengarang = pengarang;
        //this.pengarang diambil dari parameter buku, beda dengan variabel yang diatas
        
    }
    
    void cetakKeLayer(){
    //fungsi void digunakan untuk dijalakan ketika program dijalankan
        System.out.println("Judul : " + judul);
        //menampilkan judul dari inputan user
        System.out.println("pengarng : " + pengarang);
        //menampilkan pengarang dari inputan user
        System.out.println("==============");
    }
}
