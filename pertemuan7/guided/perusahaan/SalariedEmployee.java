/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.perusahaan;

/**
 *
 * @author Asus
 */
public class SalariedEmployee extends Employee {
    
    private final long upahMingguan;

    public SalariedEmployee(long upahMingguan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.upahMingguan = upahMingguan;
    }
    
    public long getUpahMingguan() {
        return upahMingguan;
    }

    @Override
    public long gaji(){
         return gaji = upahMingguan;
    }

    public void cetakSE() {
         System.out.println("Nama: " + nama);
         System.out.println("NIP: " + nip);
         System.out.println("Upah Mingguan: " + gaji());
 }
    
    
    
    
    
}
