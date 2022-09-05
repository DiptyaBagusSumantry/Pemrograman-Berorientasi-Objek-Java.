/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan5.guided.ProjectBilangan;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        int x,y; //membuat variable x dan y dengan tipe data integer
        Bilangan bil = new Bilangan(10,20);
        //inisialisasi x dan y
        x = 15;
        y = 30;
        
        //passed by value
        System.out.println("Nilai x y sebelum passed by value"); 
        System.out.println("Nilai x : " + x); //menampilkan nilai x
        System.out.println("Nilai y : " + y); //menampilkan nilai y
        
        bil.operasiPassByValue(x,y); //memanggil fungsi opersiByValue
        
        System.out.println("Nilai x y setelah passed by value");
        System.out.println("Nilai x : " + x); //menampilkan bilangan x
        System.out.println("Nilai y : " + y); //menampilkan bilangan y
        
        //passed by Reference
        System.out.println("\n Nilai bil.a dan bil.b sebelum passed by reference");
        
        bil.tampil(); //memanggil fungsi tampil pada Bilangan.java
        bil.operasiPassByReference(bil); //mengeksekusi fungsi operasiPassByReference pada Bilangan.java
        
         System.out.println("\n Nilai bil.a dan bil.b sesudah passed by reference");
         bil.tampil(); //menampilkan tampil pada Bilangan.java
    }
}
