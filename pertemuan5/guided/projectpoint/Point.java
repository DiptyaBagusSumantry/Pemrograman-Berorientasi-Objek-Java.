/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.projectpoint;

/**
 Nama : Diptya Bagus Sumantry
 NIM  : 20102281
 Kelas: S1-IF-08-R
 * @author Asus
 */
public class Point {
    protected float x,y;
    
    public Point ( float a, float b ) {
        //parameter a dan paramter b
        System.out.println("Kontruktokr Point dijalankan");
        x = a;
        // x ngambil dari parameter protected dan di ubah ke nilai a 
        y = b;
    }
    
    /**
     *sfeegege
     */
    public void cetakPoint(){
        System.out.println("Point : [" + x + ", " + y + "] " );
    }
}
