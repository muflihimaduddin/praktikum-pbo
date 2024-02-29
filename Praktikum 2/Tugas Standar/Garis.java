// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 28 Februari 2024
// Deskripsi: Kelas yang berisi program class Garis

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static float counterGaris;

    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return this.titikAwal;
    }

    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    public static float getCounterGaris() {
        return counterGaris;
    }

    public float getPanjang() {
        // return (float) Math.sqrt((getTitikAkhir().getAbsis() - getTitikAwal().getAbsis() *  getTitikAkhir().getAbsis() - getTitikAwal().getAbsis()) + (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat() * getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()));
        
        float x1 = titikAwal.getAbsis();
        float y1 = titikAwal.getOrdinat();
        float x2 = titikAkhir.getAbsis();
        float y2 = titikAkhir.getOrdinat();
        
        return (float) Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public float getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Garis getRefleksiY() {
        Garis g = new Garis(titikAwal.getRefleksiY(), titikAkhir.getRefleksiY());
        return g;
    }

    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }
}