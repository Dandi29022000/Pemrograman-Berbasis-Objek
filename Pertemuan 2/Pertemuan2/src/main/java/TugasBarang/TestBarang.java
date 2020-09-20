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
public class TestBarang {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        
        br1.kode = "001PT";
        br1.namaBarang = "Sepatu";
        br1.hargaDasar = 75000;
        br1.diskon = 5;
        br1.tampilData();
        
        System.out.println();
        Barang br2 = new Barang();
        br2.kode = "002PT";
        br2.namaBarang = "Tas";
        br2.hargaDasar = 50000;
        br2.diskon = 3;
        br2.tampilData();
    }
}
