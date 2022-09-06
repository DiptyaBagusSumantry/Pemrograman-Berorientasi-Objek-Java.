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
public class TryCatch2 {
    public static void main(String[] args) {
        try{
            int x = args.length;
            int y = 100/x;
            int [] arr = {10,11};
            
            y = arr[x];
            System.out.println("Tidak terjadi exception");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception karena pembagian dengan 0 ");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena indexs diluar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
