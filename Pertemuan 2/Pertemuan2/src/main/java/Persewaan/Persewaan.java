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
public class Persewaan {
    public int id, harga, total;
    public String namaMember, namaGame;
    
    public void tampilPeminjaman() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama Member\t: " + namaMember);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Harga Sewa\t: " + harga + "/jam");
    }
    
    public int hitungSewa(int waktuSewa) {
        int sewa = waktuSewa * harga;
        return sewa;
    }
}
