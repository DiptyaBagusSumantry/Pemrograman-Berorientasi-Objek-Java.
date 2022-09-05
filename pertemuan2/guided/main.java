/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan2.guided;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class main {
        public static void main(String[] args) {
        vision vision1, vision2, vision3 = new vision();
        //membuat obejek dari kelas vision
        
        vision1 = new vision();
        //vision1 merupakan objek kelas dari vision
        vision2 = new vision("Paiomon", "No Vision");
        //vision2 merupakan obejek dari kelas vision
        vision3 = new vision("Tatang", "Hydro");
        //vision 3 merupakan objek dari kelas vision
        
        //memnaggil cetakKeLayer pada vision.java untuk menampilkan hasil
        vision1.cetakKeLayer();
        vision2.cetakKeLayer();
        vision3.cetakKeLayer(); 
    }
}
