/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan9.guided.RelasiAgregasi;

/**
 *
 * @author Asus
 */
public class Relasi {
    public static void main(String[] args) {
        Perusahaan Per = new Perusahaan("Nusantara Jaya ");
        Pegawai Peg1, Peg2, Peg3;
        Peg1 = new Pegawai("P001", "Rudi");
        Peg2 = new Pegawai("P002", "Toni");
        Peg3 = new Pegawai("P003", "Ani");
        
        Per.insertPegawai(Peg1);
        Per.insertPegawai(Peg2);
        Per.insertPegawai(Peg3);
        
        System.out.println("");
        Per.tampilPer();
    }
}