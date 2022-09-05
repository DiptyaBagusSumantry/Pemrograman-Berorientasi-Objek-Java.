/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan7.guided;

/**
 *
 * @author Asus
 */
public class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;
    
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD){
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
        
    }
    
    public void hitungHargaPaket(){
        hargaPaket = super.hargaBuku + getHargaCD(); //memanggil method harga buku dijumlahkan dengan harga CD
    }
    
    @Override
    public void cetakCD(){
        interfaceCD.cetakCD(); //memanggil dari kelas CD
    }
    
    @Override
    public long getHargaCD(){
        return(interfaceCD.getHargaCD());//interfaceCD memanggil dari kelas CD
    }
    
    public void cetakPaket(){
        super.cetakBuku(); //memanggil kelas induk buku
        cetakCD();
        System.out.println("Harga Paket Buku dan CD : Rp"+hargaPaket);
    }

}
