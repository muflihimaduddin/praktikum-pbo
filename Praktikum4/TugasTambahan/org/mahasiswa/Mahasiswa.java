// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 22 Maret 2024
// Deskripsi : Representasi dasar dari objek mahasiswa, turunan kelas orang

package org.mahasiswa;

import org.orang.Orang;
import org.waliMahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    private String nim, jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.err.println("Mahasiswa\nNama : " + getNama() + "\nNIK : " + getNik() + "\nNIM : " + getNim() + "\nJurusan : " + getJurusan() + "\nWali : " + getWali().getNama() + "\n");
    }
}