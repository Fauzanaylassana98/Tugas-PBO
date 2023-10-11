package com.mycompany.ets_pbo;

public class Pemesanan {
    public static void main(String[] args) {
        JSONFile fileJSON = new JSONFile("C:\\Users\\user\\OneDrive\\Documents\\NetBeansProjects\\ETS_PBO\\src\\main\\java\\com\\mycompany\\ets_pbo\\data.json");
        
        fileJSON.ReadJSONFile();
        
        // Inisialisasi objek Status, ServicePackage, dan City
        Status status1 = new Status();
        ServicePackage servicePackage1 = new ServicePackage( 15000);
        City city1 = new City("JAKARTA");

        // Inisialisasi objek Delivery pertama
        Delivery delivery1 = new Delivery(status1, servicePackage1, city1, 2, 1, 80000, "Celana Jeans");

        // Inisialisasi objek Status, ServicePackage, dan City
        Status status2 = new Status();
        ServicePackage servicePackage2 = new ServicePackage( 26000);
        City city2 = new City( "SURABAYA");

        // Inisialisasi objek Delivery kedua
        Delivery delivery2 = new Delivery(status2, servicePackage2, city2, 2, 2, 90000, "Kemeja Lengan Panjang");

        // Inisialisasi array pesanan
        Delivery[] pesanan = {delivery1, delivery2};
        
        int totalQuantity = delivery1.getQuantity() + delivery2.getQuantity();
        int totalProductPrice = (delivery1.getQuantity() * delivery1.getPriceItem()) + (delivery2.getQuantity() * delivery2.getPriceItem());
        int totalShippingCost = (delivery1.getQuantity() * delivery1.getServicePackage().getValue()) + (delivery2.getQuantity() * delivery2.getServicePackage().getValue());

        // Menampilkan hasil dengan format
        System.out.println("Jumlah Produk: " + totalQuantity);
        System.out.println("Total Harga Produk: " + totalProductPrice);
        System.out.println("Ongkos Kirim: " + totalShippingCost);

        // Total keseluruhan
        int totalCost = totalProductPrice + totalShippingCost;
        System.out.println("Total Keseluruhan: " + totalCost);
    }
}
