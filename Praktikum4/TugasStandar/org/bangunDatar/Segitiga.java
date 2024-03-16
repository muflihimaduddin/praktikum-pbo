// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 16 Maret 2024
// Deskripsi : Representasi dasar dari objek segitiga, turunan kelas poligon

package org.bangunDatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alas / 2 * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }
}
