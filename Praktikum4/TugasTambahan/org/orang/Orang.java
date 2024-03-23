// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 22 Maret 2024
// Deskripsi : Representasi dasar dari objek orang

package org.orang;

public class Orang {
    protected String nama, nik;

    public Orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak() {
        System.err.println("Orang\nNama : " + getNama() + "\nNIK : " + getNik() + "\n");
    }
}
