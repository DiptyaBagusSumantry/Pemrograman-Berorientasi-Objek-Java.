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
//final tidak bisa diturunin ke kelas lain
public final class Direktur extends Pegawai{
    private double gajiDirektur;
    private double dividenSaham;
    
    public Direktur( String nama, double gaji, double dividen){
        super(nama);
        setGajiDirektur(gaji);
        setDividen(dividen);
    }

    public void setGajiDirektur(double gaji) {
        if ( gaji > 0){
            gajiDirektur = gaji;//gaji direktur disi dengan gaji di mehthod dirktur
        } else {
            gajiDirektur = 0;
        }
    }
    
    public void setDividen(double dividen){
        if(dividen > 0 ){
            dividenSaham = dividen;
        } else {
            dividenSaham = 0;
        }
    }

    public String nama() { //
        return super.namaPegawai();
    }
    
    public String jabatan(){
        return "Direktur"; //return memberikan nilai
    }
    
    public double gajiPerbulan(){
        return gajiDirektur;
    }
    
    public double labelDividen(){
        return dividenSaham;
    }
    
    public double income(){
        return (gajiDirektur + dividenSaham);
    }

    
}
