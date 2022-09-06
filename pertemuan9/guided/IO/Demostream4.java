/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Demostream4 {
    public static void main(String[] args) {
         byte data; 
         String namaFile = "test.txt"; 
         FileOutputStream fout = null; 
         
        try { 
            
            fout = new FileOutputStream(namaFile, true); 
            System.out.println("Ketik : "); 
            data = (byte) System.in.read(); 

             while(data != (byte) '\r'){ 
                 fout.write(data); 
                 data = (byte) System.in.read(); 
                 } 
        } catch (FileNotFoundException e){
            System.out.println("File " + namaFile + " tidak dapat dicreat"); 
        } catch (IOException e){ 
            
            System.out.println("Terjadi Exception"); 
        } finally { 
            
            if (fout != null){ 
        try { 
            fout.close(); 
         } catch (IOException e){  
            System.out.println("Terjadi Exception"); 
            } 
           } 
        } 
    }
}
