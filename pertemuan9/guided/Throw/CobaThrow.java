/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan10.guided.Throw;

/**
 *
 * @author Asus
 */
public class CobaThrow {
    public static void methodLain(){
        try{
            throw new ArrayIndexOutOfBoundsException(1);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception dalam method methodLain()");
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try{
            methodLain();
            
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Pengangan exception dalam method lain()");
        }
    }
}
