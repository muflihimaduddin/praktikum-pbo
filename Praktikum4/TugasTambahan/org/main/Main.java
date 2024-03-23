// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 22 Maret 2024
// Deskripsi : Driver class untuk orang, mahasiswa dan wali mahasiswa

package org.main;

import org.orang.*;
import org.mahasiswa.*;
import org.waliMahasiswa.*;

public class Main {
    public static void main(String[] args) {
        // Orang orang1 = new Orang("Muflih Muhammad", "3319051811030001");
        // Orang orang2 = new Orang("Muhammad Imaduddin", "3319051811030002");
        // Orang orang3 = new Orang("Imaduddin Muflih", "3319051811030003");

        WaliMahasiswa waliMahasiswa1 = new WaliMahasiswa("Imaduddin Muflih", "3319051811030003", "082137917230", "Jalan Raya Kudus - Pati km. 6");

        Mahasiswa mahasiswa1 = new Mahasiswa("Muflih Muhammad", "3319051811030001", "24060122140103", "Informatika", waliMahasiswa1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Muhammad Imaduddin", "3319051811030002", "240010122140103", "Matematika", waliMahasiswa1);

        waliMahasiswa1.cetak();
        mahasiswa1.cetak();
        mahasiswa2.cetak();
    }
}