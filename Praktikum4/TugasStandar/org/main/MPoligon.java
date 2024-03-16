// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 16 Maret 2024
// Deskripsi : Driver class untuk poligon dan persegi panjang

package org.main;

import org.bangunDatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(10, 10, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }
}