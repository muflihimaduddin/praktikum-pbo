// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 16 Maret 2024
// Deskripsi : Representasi dasar dari objek persegi panjang, turunan kelas poligon

package org.bangunDatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo() {
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}