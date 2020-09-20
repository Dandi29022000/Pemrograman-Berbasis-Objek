/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-2D
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang() {
        System.out.println("Nama Barang\t: " + namaBrg);
        System.out.println("Jenis Barang\t: " + jenisBrg);
        System.out.println("Stok\t\t: " + stok);
    }
   
    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
    int stokBaru = brgMasuk + stok;
    return stokBaru;
    }
}
