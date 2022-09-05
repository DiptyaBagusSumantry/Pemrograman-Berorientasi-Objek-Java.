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
public class Bus extends Mobil implements InterfaceBus {
    int kapasitasPenumpang, kapasitasBagasi;

    public Bus(int kapasitasPenumpang, int kapasitasBagasi, String noPlat, String merk, long pajak){
        super(noPlat, merk, pajak);
        this.kapasitasBagasi = kapasitasBagasi;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }


    @Override
    public void infoBus(){
        System.out.println("Kapasitas Penumpang : "+kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi  : "+kapasitasBagasi+ " Kg");
    }
    
    @Override
    public void tampilInfo(){
            System.out.println("No Kendaraan : "+noPlat);
            System.out.println("Merk  : "+merk); 
            System.out.println("Pajak : "+pajak);
            super.tampilInfo();
            
    }
    

    @Override
    public float hitungPajak(){  
       return pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005f);
       
    }
      
}
