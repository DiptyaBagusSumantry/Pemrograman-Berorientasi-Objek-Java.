/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan5.guided.Pegaawai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Pegawai tetap = new Pegawai(); //tetap dari kelas Pegawai

        //scanner untuk inputan user
        Scanner inputString = new Scanner(System.in); 
        Scanner inputBilangan = new Scanner(System.in);
        
        //User memasukan inputan sesuai pertanyaan
        System.out.print("Masukan Nip : ");
        tetap.setNip(inputBilangan.nextInt());
        System.out.print("Nama : ");
        tetap.setNama(inputString.nextLine());
        System.out.print("alamat : ");
        tetap.setAlamat(inputString.nextLine());
        System.out.print("Gaji : ");
        tetap.setGajiUtama(inputBilangan.nextInt());
        System.out.print("Hari Lembur : ");
        tetap.setLembur(inputBilangan.nextInt());
     
        //memanggil fungsi setTotal dengan gaji dan jumlah hari lembur
        tetap.setTotal(2000000,10);
        //menampilkan hasil proses
        tetap.cetak();
    }
}
