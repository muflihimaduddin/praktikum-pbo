// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 6 Maret 2024
// Deskripsi : Program penggunaan eksepsi buatan sendiri
//             Pengenalan klausa 'throw' dan 'throws'                

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!");
        }
    }
    
    // Jawaban:
    // Ketika eksepsi terjadi, proses eksekusi program pada baris 12 tidak tereksekusi dan akan langsung melompat ke bagian penanganan eksepsi dalam blok catch.
    // Baris 21 merupakan program catch yang akan dieksekusi setelah terdapat eksepsi pada eksekusi program di blok try. Hal tersebut mengakbiatkan baris code yang ada di dalam blok try tidak tereksekusi secara menyeluruh.
}