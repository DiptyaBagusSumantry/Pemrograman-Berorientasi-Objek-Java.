/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan9.guided.RelasiAsosiasi;

/**
 *
 * @author Asus
 */
public class Manusia {
    private String nama;
    private int umur;
    private Manusia ibu;
    private Manusia anak;
    
    public Manusia(){
        
    }
    
    public Manusia(String nm, int umr){
        nama = nm;
        umur = umr;
        ibu = new Manusia (); //Membuat objek ibu
        anak = new Manusia (); // Membuat objek anak
        ibu = null; // dengan nilai ibu kosong
        anak = null; // dengan nilai anak kosong
    }
    
    public Manusia(String nm, int umr, Manusia ibu_angkat){
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        ibu = ibu_angkat;
        ibu_angkat.anak = this;
    }
    
    public void adopsi(Manusia anak_angkat){
        anak = anak_angkat;
        anak_angkat.ibu = this;
        
    }
    
    public void cetak(){
        System.out.println("Data Pribadi");
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        if(ibu != null){ // jika ibu tidak kosong maka akan menampilkan nama ibu
            System.out.println("Nama Ibu : "+ibu.nama);
        } else if(anak != null){ // jika anak tiak kosong maka akan menampilkan nama anak
            System.out.println("Nama Anak : "+anak.nama);
        }
    }
}
