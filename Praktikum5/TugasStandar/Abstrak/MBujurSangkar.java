// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bujurSangkar = new BujurSangkar();
        
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bujurSangkar.hitungLuas(sisi));

        scan.close();
    }

}