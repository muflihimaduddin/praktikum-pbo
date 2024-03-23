// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas abstrak, berisi abstraksi bangun datar

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public double getLuas() {
        return this.luas;
    }

    public void setLuas(double l) {
        this.luas = l;
    }
}