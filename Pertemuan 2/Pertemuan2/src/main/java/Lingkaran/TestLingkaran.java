/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-2D
 */
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        System.out.println("Luas\t\t: "+ l1.hitungLuas());
        System.out.println("Keliling\t: " + l1.hitungKeliling());
    }
}
