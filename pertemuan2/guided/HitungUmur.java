/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan2.guided;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HitungUmur {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        //membut constructror unutk menyimpan sementara data yang diinputkan user

        int thnLahir, thnSekarang, umur;
        //membuat variabel thnLahir, thnSekarang dan umur dengan tipe data integer
        System.out.print("Lahir di tahun berapa nih ? : ");
        //menampilkan tulisan lahir ditahun brpa
        thnLahir = input.nextInt();
        //input nilai tahun lahir  dari user
        System.out.print("Sekarang tahun berapa nih ? :");
        //menampilkan tulisan sekarang tahun berapa
        thnSekarang = input.nextInt();
        //input nilai tahun sekarang dari user
        umur = thnSekarang-thnLahir;
        // variabel umur dihitung dengan cara tahun sekarang dikurangi tahun lahir

        System.out.println("Anda lahir pada tahun : " +thnLahir);
        //menampilkan tahun lahir anda
        System.out.println("Sekarang umur anda    :  " + umur);
        //menampilkan umur anda di tahun sekarang

    }
}
