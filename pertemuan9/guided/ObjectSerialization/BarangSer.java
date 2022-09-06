/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.ObjectSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class BarangSer implements Serializable{ 
    private String nama; 
    private int jumlah; 
 
    public BarangSer(String nm, int jml){ 
        nama = nm; jumlah = jml; 
    } 
    
    public void tampil(){ 
    System.out.println("Nama Barang : " + nama); 
    System.out.println("Jumlah Barang : " + jumlah); 
    } 
    public void simpanObject (BarangSer ob){ 
        
        try { 
            
            FileOutputStream fos = new 
            FileOutputStream("dtBrg.txt"); 
            ObjectOutputStream oos = new 
            ObjectOutputStream(fos); 
            oos.writeObject(ob); 
            oos.flush(); 
        } catch (IOException e){ 
            
            System.err.println("Error " + e); 
        } 
    } 
    
    public void bacaObject(BarangSer obb){ 
        
        try {
            
            FileInputStream fis = new 
            FileInputStream("dtBrg.txt"); 
            ObjectInputStream ois = new ObjectInputStream(fis); 

            while ((obb = (BarangSer) ois.readObject()) != null) { 
            obb.tampil(); 
            } 
        } catch(IOException e){
            
            System.exit(1); 
        } catch (Exception e){ 
            System.exit(1); 
        } 
    } 
    public static void main(String[] args) {
        
        BarangSer a1 = new BarangSer("Baju", 5); 
        a1.simpanObject(a1); a1.bacaObject(a1); 
    } 
}
