/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.ObjectSerialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;



/**
 *
 * @author Asus
 */
public class BarangEX implements Externalizable{ 
    private String nama; 
    private int jumlah; 
 
    public BarangEX(){ 
 
    } 
    public BarangEX(String nm, int jml){ 
        nama = nm; 
        jumlah = jml; 
    } 
    public void writeExternal(ObjectOutput out) throws IOException { 
        out.writeObject(nama); 
        out.writeObject(jumlah); 
    } 
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { 
        this.nama = (String) in.readObject(); 
        this.jumlah = in.read(); 
    } 
    public String toString(){ 
        return "Data Barang : " + nama + "\n" + "jumlah barang : " + jumlah; 
    } 
    public static void simpanObjek(BarangEX brg) throws IOException {
        
        FileOutputStream fos = new 
        FileOutputStream("dtEx.txt"); 
        ObjectOutputStream oos = new 
        ObjectOutputStream(fos); oos.writeObject(brg); 
        oos.flush(); 
    } 
    public static BarangEX bacaObjek() throws IOException, ClassNotFoundException { 
        FileInputStream fis = new FileInputStream("dtEx.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        return(BarangEX) ois.readObject(); 
     } 

    public static void main(String[] args) throws 
        ClassNotFoundException, IOException { 
        BarangEX awal = new BarangEX("Sepatu", 2); 
        simpanObjek(awal); 
        System.out.println(bacaObjek());
    }  
}