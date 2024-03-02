// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 29 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Mahasiswa dan class WaliMahasiswa

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa w1 = new WaliMahasiswa("Adinda Rizka", "081234567890", "Kudus");
        Mahasiswa m1 = new Mahasiswa("Muflih Muhammad Imaduddin", "24060122140103", "Informatika", w1);

        m1.cetak();
    }
}