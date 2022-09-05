/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan4.guided.projectbuku1;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        //Buat objek dari kelas buku
        Buku buku1, buku2 = new Buku();
        //ada obejek buku 1 dan buku2
        
        buku1 = new Buku();
        //objek buku 1 dari kelas buku
        buku2 = new Buku("Siaga merah", "Jhon Wick");
        //objek buku 2 dari kelas buku 
        //akan menampilkan siaga merah dan jhon wick sesuai dengan paramter public buku di buku.java
        
        buku1.cetakKeLayer();
        //memanggil buku 1 dan menamplkan atau dicetak
        buku2.cetakKeLayer();
       //memanggil buku 2 dan menampilkan atau dicetak
    }
}
