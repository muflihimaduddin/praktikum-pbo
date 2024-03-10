// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 10 Maret 2024
// Deskripsi : Kelas yang berisi program class Anggota

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anggota " + nama + " telah mencapai batas maksimum peminjaman buku");
        }
    
        if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku " + buku.getJudul() + " tidak tersedia atau sudah dipinjam");
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}
