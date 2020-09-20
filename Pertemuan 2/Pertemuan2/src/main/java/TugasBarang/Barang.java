/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBarang;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-2D
 */
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public double diskon;
    
    public int hitungHargaJual() {
       int hargaJual = hargaDasar - (int)((diskon/100) * hargaDasar);
       return hargaJual;
    }
    
    public void tampilData() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Dasar\t: Rp. " + hargaDasar);
        System.out.println("Diskon\t\t: " + diskon + "%");
        System.out.println("Harga Jual\t: Rp. " + hitungHargaJual());
    }
}
