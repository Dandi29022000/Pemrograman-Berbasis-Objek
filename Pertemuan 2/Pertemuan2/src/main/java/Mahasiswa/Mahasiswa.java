/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-2D
 */
public class Mahasiswa {
   public int nim;
   public String nama;
   public String alamat;
   public String kelas;
   
   public void tampilBiodata() {
       System.out.println("NIM\t: " + nim);
       System.out.println("Nama\t: " + nama);
       System.out.println("Alamat\t: " + alamat);
       System.out.println("Kelas\t: " + kelas);
   }
}
