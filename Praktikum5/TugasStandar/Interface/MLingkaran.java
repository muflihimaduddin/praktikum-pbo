// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 23 Maret 2024
// Deskripsi : Implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);;
        double jejari;
        Lingkaran lingkaran;

        System.out.print("Masukan jejari lingkaran : ");
        jejari = scan.nextDouble();
        lingkaran = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + lingkaran.hitungLuas());

        scan.close();
    }
}