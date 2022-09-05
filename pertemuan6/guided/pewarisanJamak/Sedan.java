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
public class Sedan extends Mobil{
    String fasilitasKeamanan, fasilitasKenyamanan;
    int kapasitasCC;

    public Sedan(String noPlat, String merk, long pajak, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC) {
        super(noPlat, merk, pajak);
        this. fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
    }
               
    
    public void infoSedan(){
        super.tampilInfo();
        System.out.println("Fasilitas Keamanan : "+fasilitasKeamanan);
        System.out.println("Kapasitas CC  "+kapasitasCC);
        System.out.println("Fasilitas Kenyamanan : "+fasilitasKenyamanan);
    }
    
    @Override
    public void tampilInfo(){
        infoSedan();
    }
    
    public float hitungPajak(){
        return pajak + (pajak * kapasitasCC *0.00005f);
    }
    
   
}
