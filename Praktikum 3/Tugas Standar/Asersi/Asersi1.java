// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 6 Maret 2024
// Deskripsi : Program untuk menunjukkan asersi

public class Asersi1 {
    public static void main(String[] args) {
        int x = 10;
        if (x > 0) {
            System.out.println("Nilai x positif");
        } else {
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("Nilai x negatif");
        }
    }    
}