/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan4.guided.projectBuku2;

/**
 *
 * @author Asus
 */
public class Buku {
  private String judul;
  //membuat atribut judul, private tidak dapat diakses dikelas lain
  private String pengarang;
  //membuat atribut pengarang, private tidak dapat diakses dikelas lain
  private int halaman;
  //membuat atribut halaman, private tidak dapat diakses dikelas lain
  
  public void setNilai(String judul, String pengarang, int halaman){
  //dapat diakses dikelas lain
      this.judul = judul;
      //this.judul digunakan untuk menggunakan paramter yang ada di setnilai
      this.pengarang = pengarang;
      //this.pengarng digunakan untuk menggunakan paramter yang ada di setnilai
      this.halaman = halaman;
      //this.pengarang digunakan untuk menggunakan paramter yang ada di setnilai
  }
          
 public void cetakKeLayar(){
 //digunakan untuk menampilkan hasil, dapat diakses di kelas lain
 System.out.println("Judul : " + this.judul);
 // menampilkan judul 
 System.out.println("pengarang : " + this.pengarang);
 //menampilkan pengarang
 System.out.println("halaman : " + this.halaman);
 //menampilkan halaman
 }
}
