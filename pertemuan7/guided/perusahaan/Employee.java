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
public abstract class Employee {
       
    protected String nama, nip;
    protected long gajiPokok, komisi, gaji;
    
    public Employee(String nama, String nip, long gajiPokok, long komisi) { 
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
    }

    public String nama() {
        return nama;
    }

    public String nip() {
        return nip;
    }

    public long gajiPokok() {
        return gajiPokok;
    }

    public long komisi() {
        return komisi;
    }

    public abstract long gaji();
}
