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
public class Titik {
    double x,y;
    Titik t2;
    
    public Titik(){
        
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double hitungJarak(Titik t2){
        double jarak = Math.sqrt(Math.pow(t2.x - this.x, 2)) + Math.pow(t2.y - this.y,2);
        return jarak;
    }
    
    public void tampil(){
        System.out.println("Titik X : " + x);
        System.out.println("Titik y : " + y);
    }
    
}
