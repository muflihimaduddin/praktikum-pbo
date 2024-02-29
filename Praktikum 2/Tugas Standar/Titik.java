// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 21 Februari 2024
// Deskripsi: Kelas yang berisi program class Titik

public class Titik {
    private float absis;
    private float ordinat;
    private static float counterTitik;

    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(float a, float o) {
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    public void setAbsis(float a) {
        absis = a;
    }

    public void setOrdinat(float o) {
        ordinat = o;
    }

    public float getAbsis() {
        return absis;
    }

    public float getOrdinat() {
        return ordinat;
    }

    public static float getCounterTitik() {
        return counterTitik;
    }

    public float getJarakPusat() {
        return (float) Math.sqrt(this.getAbsis() * this.getAbsis() + this.getOrdinat() * this.getOrdinat());
    }

    public void refleksiX() {
        this.ordinat = -(this.ordinat);
    }

    public void refleksiY() {
        this.absis = -(this.absis);
    }

    public Titik getRefleksiX() {
        Titik t = new Titik (this.absis, -(this.ordinat));
        return t;
    }

    public Titik getRefleksiY() {
        Titik t = new Titik (-(this.absis), this.ordinat);
        return t;
    }
}
