// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran

//Mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        this.jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}