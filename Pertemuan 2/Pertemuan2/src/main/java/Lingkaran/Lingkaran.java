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
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    
    public double hitungLuas() {
        return phi * r * r;
    }
    
    public double hitungKeliling() {
         return phi * (2 * r);
    }
}
