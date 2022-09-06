/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class Demostream3 {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        BufferedReader buff = new BufferedReader(new InputStreamReader (System.in));
        
        System.out.println("Ketik : ");
        data = (char) buff.read();
        
         while(data != 'o') {
             str += data;
             data = (char) buff.read();
         }
         
         System.out.println("Yang diketik : " +str);
         System.out.println("Program Selesai");
    }
}
