/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan7.guided;

/**
 *
 * @author Asus
 */
public class Buku {
    String judul,pengarang;
    long hargaBuku;
    //Membuat konstruktor 
    public Buku(String judul, String pengarang, long hargaBuku) {
        // this. judul memnaggil variabel yang ada dikelas sedangakan = judul memanggil variabel yang ada di parameter
        this.judul = judul; 
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }
    
    
    public void cetakBuku(){
            System.out.println("Judul : "+judul);
            System.out.println("Pengarang : "+pengarang);
            System.out.println("Harga Buku : "+hargaBuku);
            
    }
}
