/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan8.guided.namaBinatang;

/**
 *
 * @author Asus
 */
public abstract class Binatang {
    private String jenis;//varaibel jenis hanya dapat diakses di kelas Binatang
            
    Binatang(String jenis){ //konstraktuorr
        this.jenis = jenis;
    }
    
    protected abstract void suara();// protecded dapat mengakses turunanya
    
    public String toString(){
        return "Seekor "+jenis;
    }
}
