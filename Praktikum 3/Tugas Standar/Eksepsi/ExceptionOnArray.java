// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 6 Maret 2024
// Deskripsi : Program penggunana eksepsi menggunakan class library Java

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index error");
        } finally {
            System.out.println("Clean up code...");
        }
    }    
}