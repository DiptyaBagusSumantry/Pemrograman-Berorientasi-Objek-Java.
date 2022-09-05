/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.pegawai;

/**
 *
 * @author Asus
 */
public abstract class Pegawai {
    private String namaPeg;
    
    //kontraktor modifayernya public
    public Pegawai( String nama ){
        namaPeg = nama;
    }
    
    //method namanya pegawai
    public String namaPegawai(){
        return namaPeg;
    }
    
    //method income sebagai 
    public abstract double income();
}
