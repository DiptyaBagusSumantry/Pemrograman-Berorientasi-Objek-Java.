/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan9.guided.bangunRuang;

/**
 *
 * @author Asus
 */
public class SgtSamaSisi extends Titik {
    public double sisiSegitiga;
    
    public SgtSamaSisi(double x1, double y1, double x2, double y2){
        super.x = x1;
        super.y = y1;
        t2 = new Titik(x2,y2);
    }
    
    public double hitungLuas(){
        sisiSegitiga = super.hitungJarak(t2);
        double Luas = 0.5 * sisiSegitiga * Math.sqrt(3);
        return Luas;
    }
    
    @Override
    public void tampil(){
            System.out.println("=====Luas Segitiga=====");
            System.out.println("Point : [" + super.x + ", " + super.y + "]");
            System.out.println("Sisi Segitiga : " + sisiSegitiga);
            System.out.println("Luas Segitiga : " + hitungLuas());

    }
}
