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
public class CD {
    String ukuran;
    long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }
    
    public long getHargaCD(){ 
        return hargaCD;
    }
    
    public void cetakCD(){
        System.out.println("Ukuran CD : "+ ukuran);
        System.out.println("Harga CD : "+hargaCD);
        System.out.println("");
    }
}
