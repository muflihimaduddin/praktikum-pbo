// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 10 Maret 2024
// Deskripsi : Program penggunaan eksepsi buatan sendiri

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Muflih Muhammad");
        Anggota anggota2 = new Anggota("Muhammad Imaduddin");

        Buku buku1 = new Buku("Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("Grafika dan Komputasi Visual");
        Buku buku3 = new Buku("Sistem Cerdas");
        Buku buku4 = new Buku("Manajemen Basis Data");
        Buku buku5 = new Buku("Rekayasa Perangkat Lunak");

        try {
            anggota1.pinjamBuku(buku1);
            System.out.println(anggota1.getNama() + " meminjam buku " + buku1.getJudul());

            anggota1.pinjamBuku(buku2);
            System.out.println(anggota1.getNama() + " meminjam buku " + buku2.getJudul());

            anggota1.pinjamBuku(buku3);
            System.out.println(anggota1.getNama() + " meminjam buku " + buku3.getJudul());

            anggota1.pinjamBuku(buku4);
            System.out.println(anggota1.getNama() + " meminjam buku " + buku4.getJudul());
        } catch (MaksimumBukuTerpinjamException exception) {
            System.out.println(exception.getMessage());
        } catch (BukuTidakTersediaException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            anggota2.pinjamBuku(buku4);
            System.out.println("\n" + anggota2.getNama() + " meminjam buku " + buku1.getJudul());

            anggota2.pinjamBuku(buku5);
            System.out.println(anggota2.getNama() + " meminjam buku " + buku2.getJudul());

            anggota2.pinjamBuku(buku1);
            System.out.println(anggota2.getNama() + " meminjam buku " + buku3.getJudul());
        } catch (BukuTidakTersediaException exception) {
            System.out.println(exception.getMessage());
        } catch (MaksimumBukuTerpinjamException exception) {
            System.out.println(exception.getMessage());
        }
    }
}