/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan4.guided.projectBuku2;

/**
 *
 * @author Asus 
 */
public class Main {
    public static void main(String[] args) {
        Buku a = new Buku();
        //buku adalah class, dan a adalah sebuah object
       
            a.setNilai("ipa", "aku", 120);
            //memasukann ipa,aku dan 120 dari paramter setNlai di buku.java
            a.cetakKeLayar();
            //memanggil fungsi cetakKeLayer untuk menampilkan output
    }
}

