/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan6.guided.Perusahaan;

/**
 * 
 Nama : Diptya Bagus Sumantry
 NIM  : 20102281
 Kelas: S1-IF-08-R
 * @author Asus
 */
public class main {
    public static void main(String[] args) {
        
        Satpam S = new Satpam(); // memanggil kelas Satpam dan membuat kelas S
        Sales T = new Sales(); //memanggil kelas Sales dan membuat kelas M 
        Manager M = new Manager(); //memanggil kelas Manager dan membuat kelas M
        
        S.setSatpam("Rendra","0042","Jl. Itik 15",2000,300000,5); //memanggil S dan mengatur data pada kelas satpam sesuai data inputan user
        T.setSales("Wibisana","0185","Jl. Ayam 78",2006,500000,10); //memanggil T dan mengatur data pada kelas sales sesuai data inputan user
        M.setManager("Adi","0005","Jl. Angsa 56" ,1999 ,1500000 ,"Keuangan"); //memanggil M dan mengatur data pada kelas Manager sesuai data inputan user
        S.cetakSatpam(); // memanggil kelas S  dan mencetak satpam pada kelas Satpam
        T.cetakSales(); // memanggil kelas T  dan mencetak sales pada kelas Sales
        M.cetakManager(); // memanggil kelas M  dan mencetak Manager pada kelas Manager
    } 
}
