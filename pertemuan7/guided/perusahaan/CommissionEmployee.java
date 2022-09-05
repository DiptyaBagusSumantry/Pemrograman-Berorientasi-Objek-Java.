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
public class CommissionEmployee extends Employee {
     private final long totalPenjualan;

    public CommissionEmployee(long totalPenjualan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.totalPenjualan = totalPenjualan;
    }
     

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    @Override
    public long gaji() {
        return gaji = (gajiPokok + (komisi * totalPenjualan));
    }

    public void cetakCE(){
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Penjualan: " + totalPenjualan);
        System.out.println("Komisi: " + komisi);
        System.out.println("Gaji: " + gaji());
    }
    
}
