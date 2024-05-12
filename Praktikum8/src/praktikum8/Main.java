/* 
* Nama     : Muflih Muhammad Imaduddin
* NIM      : 24060122140103
* Tanggal  : 12 Mei 2024
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8;

/**
 *
 * @author muflihimaduddin
 */
public class Main {
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;

        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}