/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.pegawai;

import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
    Pegawai pgw;
    String output = " ";
    
    Direktur d = new Direktur("Wahyu", 12000000.00,7500000.00);
    
    DecimalFormat digitPersisi = new DecimalFormat("0.00");
    
    pgw = d;
    
        System.out.println("Demo Inheritance, Enkapsulasi, Polimorfi");
        System.out.println("----------------------------------------");
        System.out.println("Nama : "+d.namaPegawai());
        System.out.println("Jabatan : "+d.jabatan());
        System.out.println("Gaji : "+digitPersisi.format(d.gajiPerbulan()));
        System.out.println("Dividen : "+digitPersisi.format(d.labelDividen()));
        System.out.println("Total : "+digitPersisi.format(d.income()));
    }

}
