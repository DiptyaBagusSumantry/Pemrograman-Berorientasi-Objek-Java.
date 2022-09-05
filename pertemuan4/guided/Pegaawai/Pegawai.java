/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diptya.praktikumpbo.pertemuan5.guided.Pegaawai;

/**
 *
 * @author Asus
 */
public class Pegawai {
    //private tidak dapat diakses di kelas lain
	private int nip,lembur;
	private String nama, alamat;
        private double gajiutama, gajitotal;



        //set, fungsi mutator   
	public void setNip(int Nip){
		nip=Nip;
	}
	public void setNama(String Nama){
		nama=Nama;
	}
	public void setAlamat(String Alamat){
		alamat=Alamat;
	}
	public void setGajiUtama(double GajiUtama){
		gajiutama=GajiUtama;
	}
	public void setLembur(int Lembur){
		lembur=Lembur;
	}
        
        //fungsi accessor  
	public int getNip() {
		return nip;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public double getGajiUtama() {
		return gajiutama;
	}
	public int getLembur() {
		return lembur;
	}
	
        //overloading perhitungan gaji total
	public void setTotal(double gajiutama, int lembur) {
                this.gajiutama = gajiutama;
                this.lembur= lembur;
		this.gajitotal = gajiutama + (gajiutama * lembur * 0.01);
	}
        
        //menampilkan hasil
	public void cetak()
	{
		System.out.println("NIP Pegawai : "+ getNip());
		System.out.println("Nama Pegawai : "+ getNama());
		System.out.println("Alamat Pegawai : "+ getAlamat());
		System.out.println("Gaji Pokok : "+ getGajiUtama());
		System.out.println("Hari Lembur : "+ getLembur());
		System.out.println("Total Gaji : "+ gajitotal);
		System.out.println("");
	}	

}
