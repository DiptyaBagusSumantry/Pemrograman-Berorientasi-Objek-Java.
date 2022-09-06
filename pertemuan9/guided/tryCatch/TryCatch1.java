/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.tryCatch;

/**
 *
 * @author Asus
 */
public class TryCatch1 {
    public static void main(String[] args) {
        
        try{ 
            int [] arr = new int[1];
            System.out.println(arr[1]);
            System.out.println("Baris ini tidak akan dieksekusi karena statment baris diatas terjadi exception");
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Terjadi exception karena index diluar kapasitas array");
        }
        System.out.println("Setelah Block Try catch");
    }
}
