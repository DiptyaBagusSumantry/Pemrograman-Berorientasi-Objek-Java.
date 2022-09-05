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
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle (6.5f, 8.2f, 1.9f );
        //memanggil kelas circle dan membuat kelas circle 1
        circle1.cetakPoint();
        //memanggil circle 1 dan memanggil cetak point dipanggil dari kelas circle
        System.out.println("");
        Circle circle2 = new Circle (10, 5, 5);
        circle2.cetakPoint();
    }
}
