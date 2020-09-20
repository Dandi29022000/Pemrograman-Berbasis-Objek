/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-2D
 *  NIM     : 1941720009
 */
package tasdemo;
public class Tas {
    private String merek, warna, bahan;
    private int harga, berat;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }
    
    public void setBahan(String newValue) {
        bahan = newValue;
    }
    
    public void harga(int increment) {
        harga = increment;
    }
    
    public void berat(int increment) {
        berat = increment;
    }
    
    public void cetakStatus() {
        System.out.println("Merek\t: " + merek);
        System.out.println("Warna\t: " + warna);
        System.out.println("Berat\t: " + berat + "gram");
        System.out.println("Harga\t: Rp. " + harga);
        System.out.println();
    }
}
