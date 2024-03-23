// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 22 Maret 2024
// Deskripsi : Representasi dasar dari objek wali mahasiswa, turunan kelas orang

package org.waliMahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHp, alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return this.nomorHp;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        System.out.println("Wali Mahasiswa\nNama : " + getNama() + "\nNIK : " + getNik() + "\nNomor HP : " + getNomorHp() + "\nAlamat : " + getAlamat() + "\n");
    }
}
