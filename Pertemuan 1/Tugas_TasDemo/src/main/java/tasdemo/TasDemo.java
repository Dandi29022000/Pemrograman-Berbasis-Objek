/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasdemo;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-2D
 *  NIM     : 1941720009
 */
public class TasDemo {
    public static void main(String[] args) {
        // Buat dua buah objek tas
        Tas ts1 = new Tas();
        Tas ts2 = new Tas();
        
        // Panggil method didalam objek tas
        ts1.setMerek("Eiger");
        ts1.setBahan("Condura");
        ts1.setWarna("Army");
        ts1.harga(98000);
        ts1.berat(270);
        ts1.cetakStatus();
        
        ts2.setMerek("Gearbag");
        ts2.setBahan("Dinier");
        ts2.setWarna("Navy");
        ts2.harga(170000);
        ts2.berat(300);
        ts2.cetakStatus();
    }
}
