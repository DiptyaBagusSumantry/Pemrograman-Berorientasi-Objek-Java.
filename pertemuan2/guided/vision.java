/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan2.guided;

/**
 *
 * @author Asus
 */
public class vision {
    private String nama;
    // nama tidak bisa diakses di kelas lain
    private String  vision;
    //vision tidak bisa diakses dikelas lain 
    
    public vision(){
        nama = "NO NAME";
        vision = "NO VISION";
    }
    
    public vision (String nama, String vision){
        this.nama = nama;
        this.vision = vision;
    }
    
    void cetakKeLayer(){
        System.out.println("Nama : " + nama);
        System.out.println("Vision " + vision + "\n");
    }
}
