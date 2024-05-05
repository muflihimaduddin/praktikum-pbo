// Nama     : Muflih Muhammad Imaduddin
// NIM      : 24060122140103
// Tanggal  : 5 Mei 2024

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author muflihimaduddin
 */
public class KontrolSenjata extends Senjata {
    public Senjata senjata;
    
    public KontrolSenjata(Senjata s) {
        super(s.getBunyi());
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return this.getPeluru() == 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        this.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (this.getPeluru() == 0) {
            System.out.println("Peluru habis");
        } else {
            while (this.getPeluru() > 0 && jumlah > 0) {
                System.out.println(this.getBunyi());
                this.setPeluru(-1);
                jumlah--;
            }
            if (jumlah > 0) {
                for (int i = 0; i < jumlah; i++) {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + this.getPeluru());
        }
    }
    
    public String menusuk() {
        return "";
    }
    
    public void pasangBayonet() {
        
    }
}