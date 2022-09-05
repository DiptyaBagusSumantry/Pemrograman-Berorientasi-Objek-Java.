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
public class childBus extends Bus implements InterfaceBus {
        public childBus(int kapasitasPenumpang, int kapasitasBagasi, String noPlat, String merk, long pajak){
        super(kapasitasPenumpang, kapasitasBagasi,noPlat, merk, pajak);// super buat memanggil konstukrtor 
    }
}
