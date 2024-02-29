// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 21 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Titik

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        
        float counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik : " + counterTitik);

        absis = t1.getAbsis();
		ordinat = t1.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        
        absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

        absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);

        System.out.println("\nJarak titik t1 terhadap titik pusat = " + t1.getJarakPusat());
        System.out.println("Jarak titik t2 terhadap titik pusat = " + t2.getJarakPusat());
        System.out.println("Jarak titik t3 terhadap titik pusat = " + t3.getJarakPusat());

        t1.refleksiX();
        t1.refleksiY();
        System.out.println("\nPencerminan titik t1 terhadap sumbu X = (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik t4 = t2.getRefleksiX();
        System.out.println("Titik t4 hasil pencerminan titik t2 terhadap sumbu X = (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");

        Titik t5 = t3.getRefleksiY();
        System.out.println("Titik t5 hasil pencerminan titik t3 terhadap sumbu Y = (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");
    
        // KESIMPULAN
        // Program ini menciptakan beberapa objek titik dengan nilai tertentu, mencetak informasi jumlah objek titik yang dibuat, nilai absis dan ordinat setiap titik, jarak setiap titik terhadap pusat koordinat, dan hasil pencerminan terhadap titik-titik. 
    }
}
