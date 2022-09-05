/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.projectpoint;

/**
 *
 * @author Asus
 */
public class Circle extends Point {
    private final float radius;
    //hanya bisa diakses kelas ini aja
    
    public Circle (float r, float a, float b  ) {
        //terdapat parameter r , a dan b
        super(a,b);
        //super digunakan untuk meanggil dari kelas induk
        radius = r;
        System.out.println("Kontraktor CIrcle dijalankan");
    }
    
  
    @Override
    public void cetakPoint(){
        //override sama kaya kelas induk
        super.cetakPoint(); // memanggil cetak point di kelas point
        System.out.println("radius : " + radius);
    }
    
}
