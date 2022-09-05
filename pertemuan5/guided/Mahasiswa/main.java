/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.Mahasiswa;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args) {
        datasatu satu = new datasatu();
        datadua dua = new datadua();
        
        System.out.println("Data ke satu : ");
        satu.tampilkanNama();
        satu.tampilkanNim();
        satu.tampilkanKelas();
        System.out.println("=================");
        System.out.println("Data ke dua : ");
        dua.tampilkanNama();
        dua.tampilkanNim();
        dua.tampilkanKelas();
    }
}
