/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan9.guided.RelasiAgregasi;

/**
 *
 * @author Asus
 */
public class Pegawai {
    private String nama;
    private String NIP;
    
    public Pegawai(){
        System.out.println("Konstruktor Pegawai dijalankan");
    }
    
    public Pegawai(String NIP, String nama){
        this.NIP = NIP;
        this.nama = nama;
    }
    
    public void tampilPeg(){
            System.out.println("NIP : "+ NIP +" ,Nama : "+nama);
    }
}
