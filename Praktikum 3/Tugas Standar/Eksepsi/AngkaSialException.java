// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 6 Maret 2024
// Deskripsi : Eksepsi buatan sendiri, menolak angka masukan 13!

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}