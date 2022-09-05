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
public class MiniBus extends Sedan implements InterfaceBus {
    String tipe;
    InterfaceBus childBus;
    
    public MiniBus( String tipe, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC, String noPlat, String merk, long pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(fasilitasKeamanan, fasilitasKenyamanan,pajak, noPlat, merk, kapasitasCC);
        this.tipe = tipe;
        childBus = new Bus(kapasitasPenumpang, kapasitasBagasi, noPlat, merk, pajak);
    }




    public void infoMiniBus(){
        if (tipe == "Pribadi"){
            System.out.println("Tipe MiniBus : Pribadi, digunakan sebagai kendaraan pribadi");
        }
        if (tipe == "Wagon"){
            System.out.println("Tipe MiniBus : Wagon digunakan sebagai kendaraan angkut travel ");
        }
    }
      
       @Override
    public void infoBus() {
        childBus.infoBus();
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        childBus.infoBus();
        infoMiniBus();  
    }
    
       
    
    @Override
    public float hitungPajak(){
        if (tipe == "Pribadi") {
             pajak =  (long) ((super.hitungPajak() * 0.05f) + ( childBus.hitungPajak() * 0.03f));
        }
        if (tipe == "Wagon") {
             pajak =  (long) ((super.hitungPajak() * 0.03f) + ( childBus.hitungPajak() * 0.05f));
        }
        return pajak;
    }
}
