// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 29 Februari 2024
// Deskripsi: Kelas yang berisi program class Mahasiswa

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    
    public Mahasiswa() {
        nama = new String();
        nim = new String();
        jurusan = new String();
        wali = new WaliMahasiswa();
    }

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.out.println("Mahasiswa\nNama     : " + getNama() + "\nNIM      : " + getNim() + "\nJurusan  : " + getJurusan());
        System.out.println("\nWali Mahasiswa\nNama     : " + getWali().getNama() + "\nNomor HP : " + getWali().getNomorHp() + "\nAlamat   : " + getWali().getAlamat());
    }
}