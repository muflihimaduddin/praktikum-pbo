// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Garis

public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(1,2), new Titik(3,4));
        System.out.println("Titik awal garis g1: (" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g1: (" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");

        Garis g2 = new Garis(new Titik(5,8), new Titik(6,7));
        System.out.println("\nTitik awal garis g2: (" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g2: (" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\nPanjang garis g1 = " + g1.getPanjang());
        System.out.println("Panjang garis g2 = " + g2.getPanjang());

        System.out.println("\nGradien garis g1 = " + g1.getGradien());
        System.out.println("Gradien garis g2 = " + g2.getGradien());

        Garis g3 = g1.getRefleksiY();
        System.out.println("\nTitik awal garis g3 hasil pencerminan garis g1 terhadap sumbu Y: (" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g3 hasil pencerminan garis g1: (" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + ")");
        
        System.out.println("\nApakah garis g1 tegak lurus dengan garis g2? " + g1.isTegakLurus(g2));
    }
}
