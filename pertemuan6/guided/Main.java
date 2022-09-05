/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan7.guided;

/**
 *
 * @author Asus
 */
public class Main { //program untuk dijalankan
    public static void main(String[] args) {
        //membuat obejek a dan parameter di isi sesuai paramter yang ad adi paket
        Paket a = new Paket("pemrograman Berorientasi Object", "Benyamin Langgu Sinaga",60000,"700 MB",50000);
                a.hitungHargaPaket(); //memnaggil kelas paket pada hitungHargapaket
                a.cetakPaket();
                
                
    }
}
