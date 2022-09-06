/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.IO;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Demostream2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        
        System.out.print("Masukan Data : ");
        
        try{
            panjang = System.in.read(data);
            System.out.println("Yang Anda ketik : ");
            System.out.write(data);
            System.out.println("");
            System.out.println("Panjang Karakter : " + panjang);
            System.out.println("Index Ke-1 sebanyak 3 : ");
            System.out.write(data, 1, 3);
        } catch (IOException e){
            System.out.println("Terjadi Exception");
        }
    }
}
