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
public class Limas extends Persegi{
    private final SgtSamaSisi Sgt;
    private final Persegi Psg;
    
    public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){
        super(Sx1, Sy1, Sx2, Sy2);
        Sgt = new SgtSamaSisi (Sx1, Sy1, Sx2, Sy2);
        Psg = new Persegi (Px1, Py1, Px2, Py2);
    }
    
    @Override
    public double hitungLuas(){
        double luasSegitiga = Sgt.hitungLuas();
        double luasPersegi = Psg.hitungLuas();
        double Luas = ( 4 * luasSegitiga) + luasPersegi;
        return Luas;
    }
    
    @Override
    public void tampil(){
        Sgt.tampil();
        Psg.tampil();
        System.out.println("Luas Limas : " + hitungLuas());
    }
    
}
