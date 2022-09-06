/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.tryCatchFinally;

/**
 *
 * @author Asus
 */
public class cobaFinally {
    public static void main(String[] args) {
        
        int x = 3;
        int[] arr = {10,11,12};
        
        try {
            System.out.println(arr[x]);
            System.out.println("Tidak terjadi exception");
        } catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("Terjadi Exception");
                System.out.println(arr[x-4]);
        } finally {
            System.out.println("Program Selesai");
        }
    }
}
