// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 10 Maret 2024
// Deskripsi : Eksepsi buatan sendiri, menolak anggota yang meminjam buku lebih dari 3 kali

public class MaksimumBukuTerpinjamException extends Exception {
    public MaksimumBukuTerpinjamException(String message) {
        super(message);
    }        
}