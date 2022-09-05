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
public class Bilangan {
    private int a; //membuat atribut a, private tidak dapat diguanakan dikelas lain
    private int b; //membuat atribut b, private tidak dapat diguanakan dikelas lain

    public Bilangan(int a, int b) { //dapat diakses  kelas lain 
        this.a = a;  //this.a digunakan pada parameter yang ada di Bilangan
        this.b = b; //this.b digunakan pada parameter yang ada di Bilangan
    }
    
    public void tampil(){ //menampilkan hasil dapat diakses di kelas lain
        System.out.println("Nilai bil.a : " + a);  //menampilkan bilangan a 
        System.out.println("Nilai bil.b : " + b); //menampilkan bialngan b
    }
    
    public void operasiPassByValue(int x, int y){ //melakukan oprasi bilangan
        x = x * 10; //operator perkalian, nilai x dikali dengan 10 
        y = y + 15; //operator penjumlahan, nilai y ditambah 15
    }
    
    public void operasiPassByReference(Bilangan bil){ //oprasi bilangan
        bil.a = bil.a * 10; // bila.a akan dikali nilai 10
        bil.b = bil.b + 15; //bil.b akan ditambah nilai 15
    }
}
  
