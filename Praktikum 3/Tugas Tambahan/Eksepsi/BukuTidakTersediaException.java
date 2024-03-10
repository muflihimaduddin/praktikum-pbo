// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 10 Maret 2024
// Deskripsi : Eksepsi buatan sendiri, menolak peminjaman buku yang tidak tersedia

public class BukuTidakTersediaException extends Exception {
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}