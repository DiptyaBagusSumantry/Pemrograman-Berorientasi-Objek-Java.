/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan7.guided.pewarisanJamak;

/**
 *
 * @author Asus
 */
public class Mobil {
    String noPlat, merk;
    long pajak;
    
    // Membuat kontraktor 
    //this.noPlat memnaggil variabel yang ada dikelas sedangakan =noPlat memanggil variabel yang ada di parameter
    public Mobil( String noPlat, String merk, long pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;    
    }
    
    public void tampilInfo(){
        System.out.println("noPlat = "+noPlat);
        System.out.println("Merk = "+merk);
        System.out.println("Pajak = "+pajak);
    }
    
}
