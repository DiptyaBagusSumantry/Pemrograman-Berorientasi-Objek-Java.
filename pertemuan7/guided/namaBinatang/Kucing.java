/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.namaBinatang;

/**
 *
 * @author Asus
 */
public class Kucing extends Binatang{
    
       private String nama; //
    
    Kucing (String nama){ //konstruktor
        super("Kucing");
        this.nama = nama;
        
    }
    
    @Override
    public void suara(){ //turunan dari kelas Binatang
        System.out.println("Mengeong");
    }
    
    @Override
    public String toString(){ // turunan dari kelas Binatang
        return super.toString() + " "+nama; // memanggil method toString dari kelas Binatang
    }
}
