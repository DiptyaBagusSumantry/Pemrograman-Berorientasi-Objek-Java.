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
public class Perusahaan {
    private final String namaPer;
    private final Pegawai peg[];
    private int counter;


   public Perusahaan(String namaper) {
        this.namaPer = namaper;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor perusahaan dijalankan");    }
    
    public void insertPegawai(Pegawai p){
        peg[counter] = p;
        counter++;
    }
    
    public void tampilPer(){
        System.out.println("Perusahaan "+namaPer + "Memiliki Pegawai : ");
        for(int i = 0; i < counter; i++){
            peg[i].tampilPeg();
        }
    }
}
