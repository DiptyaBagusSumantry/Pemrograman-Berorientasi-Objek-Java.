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
public class DemoStream1 {
    public static void main(String[] args) {
        byte[] data = new byte[10]; //tipe data byte untuk pmrosesan input dalam byte
        System.out.print("Masukan Data : ");
        
        try{
            System.in.read(data);
        } catch (IOException e){
            System.out.println("Terjadi Exception");
        }
        
        System.out.println(" Yang Anda ketik : ");
        for(int i = 0; i < data.length; i++ ){
            System.out.println((char)data[i]);
        }
    }
}
