/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persewaan;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-2D
 */
public class TestPersewaan {
    public static void main(String[] args) {
        Persewaan ps1 = new Persewaan();
        
        ps1.id = 29;
        ps1.namaMember = "Dandi Agung Setiawan";
        ps1.namaGame = "Mobile Legend Bang Bang";
        ps1.harga = 7000;
        ps1.tampilPeminjaman();
        
        System.out.println("Total Harga\t: " + ps1.hitungSewa(3));
    }
}
