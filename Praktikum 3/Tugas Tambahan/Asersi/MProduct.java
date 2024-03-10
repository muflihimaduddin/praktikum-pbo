// Nama      : Muflih Muhammad Imaduddin
// NIM       : 24060122140103
// Tanggal   : 10 Maret 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan class Product

public class MProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 4, 1700);
        Product product2 = new Product("Handphone", 7, 600);

        product1.addStock(1);

        System.out.println("Product1 Name  : " + product1.getName());
        System.out.println("Product1 Stock : " + product1.getStock());
        System.out.println("Product1 Price : " + product1.getPrice());
        
        System.out.println("\nProduct2 Name  : " + product2.getName());
        System.out.println("Product2 Stock : " + product2.getStock());
        System.out.println("Product2 Price : " + product2.getPrice());

        product1.purchaseProduct(6);
        System.out.println("\nProduct1 Stock : " + product1.getStock());

        product2.setStock(0);
        System.out.println("\nProduct2 Stock : " + product2.getStock());
    } 
}