/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan1.guided;


import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main { //membuat kelas
    public static void main(String[]args){
        System.out.println("Hello Word"); 
        //system.out.println untuk menampilkan output beda baris
        //system.out.print untuk menampilkan output satu baris
        //Menampilkan output Hello word dengan beda baris
        System.out.println("Good Morning");
        //Menampilkan output Good Morning 
        int a,b,hasil,perkurangan,perkalian;
        //Membuat variable dengan tipe data integer
        float pembagian;
        //Membuat variable dengan tipe data float
        //a = 10;
        //Mendeklarasikan variable a dengan nilai 10
        //b = 5;
        //Mendeklarasikan variabel b dengan nilai 5
        Scanner input = new Scanner (System.in);
        //Scanner digunkan untuk memasukan input oleh user
        Scanner inputString = new Scanner ( System.in);
        //Scanner digunkan untuk memasukan input oleh user
        String nama,alamat;
        //membuat variabel nama dan alamat dengan tipe data string
        int nim,tlp;
        //membuat variabel nim dan tlp dengan tipe data integer
        
        System.out.print("Nama : ");
        //menampilkan nama
        nama = input.nextLine();
        //menyimpan sementara inputan nama
        
        System.out.print("Nim : ");
        //menampilkan nim
        nim = input.nextInt();
        //menyimpan sementara inputan nim
        
        System.out.print("TLP : ");
        //menampilkan tlp
        tlp = input.nextInt();
        //menyimpan sementara inputan tlp
        
        System.out.print("Alamat : ");
        //menampilkan alamat 
        alamat = inputString.next();
        //menyimpan sementara inputan alamat
        
        System.out.println("nilai a : ");
        //menampilkan nilai a
        a = input.nextInt();
        System.out.println("nilai b : " );
        //menampilkan nilai b
        b = input.nextInt();
        hasil = a+b;
        //mendeklrasikan hasil sebagai penjumlahan a dan b
        perkurangan = a-b;
        //mendeklrasikan perkurangan a dan b
        perkalian = a*b;
        //mendeklrasikan perkalian a dan b
        pembagian = (float) b/ (float) a;
        //mendeklrasikan pembagian a dan b dengan tipe data float 
        
        System.out.println("penjumlahan a+b : " + hasil);
        //menampilkan penjumlahan a dan b dari variabl hasil
        System.out.println("Penjumlahan a+b = " +(a+b));
        
        //Percabangan if else
        if ( a > b ){
            System.out.println("Benar");
        //jika nilai a lebih besar dari b akan menampilkan benar
        } else if (b < a) {
            System.out.println("salah");
        //jika nilai b lebih kecil dari a akan menampilkan salah
        } else {
            System.out.println("sama dengan");
        //jika nilai a sama dengan b akan menampilkan sama dengan
        }
        
        System.out.println("Nama : Diptya Bagus Sumantry");
        //menampilkan nama :  Diptya Bagus Sumantry
        System.out.println("Nim : 20102281");
        //menampilkan Nim : 20102281
        System.out.println("Kelas : R");
        //menampilkan Kelas : R
        System.out.println("TLP : 085157644264");
        //menampilkan TLP : 085157644264
        
        System.out.println("Perkurangan a-b = " + perkurangan);
        //menampilkan hasil perkurangan a dan b
        System.out.println("perkalian a*b = " +perkalian);
        //menampilkan hasil perkalian a dan b
        System.out.println("pembagian a/b = " + pembagian);
        //menampilkan hasil pembagian b dan a
        
        //tipe data integer digunakan untuk angka
        //tipe data float/double digunakan untuk bilangan desimal 
    }

}

