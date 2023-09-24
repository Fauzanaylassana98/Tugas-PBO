package com.mycompany.pertemuan5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class RestaurantMain {
    static final Logger logger = Logger.getLogger(RestaurantMain.class.getName());
    
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        menu.tambahMenuMakanan(new Produk("Bala-bala", 1_000, 20));
        menu.tambahMenuMakanan(new Produk("Gehu", 1_000, 25));
        menu.tambahMenuMakanan(new Produk("Tahu", 1_000, 10));
        menu.tambahMenuMakanan(new Produk("Molen", 1_000, 30));
        menu.tambahMenuMakanan(new Produk("Combro", 1_000, 20));
        menu.tambahMenuMakanan(new Produk("Mendoan", 1_000, 25));
        menu.tambahMenuMakanan(new Produk("Tempe", 1_000, 10));
        menu.tambahMenuMakanan(new Produk("Donat", 1_000, 30));
        menu.tambahMenuMakanan(new Produk("Singkong", 1_000, 20));
        menu.tambahMenuMakanan(new Produk("Risol", 1_000, 25));
        menu.tambahMenuMakanan(new Produk("Cireng", 1_000, 10));
        menu.tambahMenuMakanan(new Produk("Gemblong", 1_000, 30));

        Scanner scanner = new Scanner(System.in);
        
        Penjualan pesanan = new Penjualan();

        while (true) {
            menu.tampilMenuMakanan();

            logger.info("Pilih menu (ketikkan nama makanan): ");
            String pilihan = scanner.nextLine();
        
            if (menu.cekMenuMakanan(pilihan)) {
                logger.info("Jumlah yang ingin dibeli: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine();
                if(menu.cekStokMakanan(pilihan, jumlah)){
                    menu.kurangiStokMenu(pilihan, jumlah);
                    pesanan.tambahPesanan(new Produk(menu.namaMakanan(pilihan), menu.hargaMakanan(pilihan), jumlah));
                    pesanan.tampilPesanan();
                    logger.info("Apakah anda ingin memesan lagi (yes/no)");
                    String pesanLagi = scanner.nextLine();
                    if (pesanLagi.equals("no")){
                        logger.info("Terima kasih telah berbelanja");
                        break;
                    }
                } else {
                    logger.info("Maaf, pesanan Anda tidak dapat diproses. Stok tidak mencukupi.");
                }
                
            } else {
                logger.info("Maaf, pesanan Anda tidak dapat diproses. Menu tidak tersedia.");
            }
        }
    }
}

class Produk {
    static final Logger logger = Logger.getLogger(Produk.class.getName());
    private final String nama;
    private final double harga;
    private int kuantitas;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.kuantitas = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public boolean isOutOfStock() {
        return kuantitas == 0;
    }

    public void tampilkanProduk() {
        logger.info(nama + "[" + kuantitas + "]" + "\tRp. " + harga);
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= kuantitas) {
            kuantitas -= jumlah;
        } else {
            logger.info("Stok tidak mencukupi.");
        }
    }
}

class RestaurantMenu {
    static final Logger logger = Logger.getLogger(RestaurantMenu.class.getName());
    private final List<Produk> daftarMenu;

    public RestaurantMenu() {
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenuMakanan(Produk menu) {
        daftarMenu.add(menu);
    }

    public void tampilMenuMakanan() {
        logger.info("\nMenu Makanan:");
        for (Produk menu : daftarMenu) {
            if (!menu.isOutOfStock()) {
                menu.tampilkanProduk();
            }
        }
    }

    public boolean cekMenuMakanan(String namaMenu) {
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                return true;
            }
        }
        return false; // Jika menu tidak ditemukan
    }
    
    public String namaMakanan(String namaMenu) {
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                return menu.getNama();
            }
        }
        return "tidak ada";
    }
    
    public double hargaMakanan(String namaMenu) {
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                return menu.getHarga();
            }
        }
        return 0.0;
    }
    
    public boolean cekStokMakanan(String namaMenu, int jumlah) {
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                return menu.getKuantitas() >= jumlah;
            }
        }
        return false;
    }
    
    public void kurangiStokMenu(String namaMenu, int jumlah){
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                menu.kurangiStok(jumlah);
            }
        }
    }

    public double totalHarga(String namaMenu, int jumlah) {
        for (Produk menu : daftarMenu) {
            if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                return menu.getHarga() * jumlah;
            }
        }
        return 0; // Jika menu tidak ditemukan
    }
}

class Penjualan {
    static final Logger logger = Logger.getLogger(Penjualan.class.getName());
    private final List<Produk> daftarPesanan;
    
    public Penjualan() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(Produk pesanan) {
        daftarPesanan.add(pesanan);
    }

    public boolean cekPesanan(String namaProduk) {
        for (Produk pesanan : daftarPesanan) {
            if (pesanan.getNama().equalsIgnoreCase(namaProduk)) {
                return true; //jika produk sudah ada di list pesanan
            }
        }
        return false;
    }
    
    public double totalBayar() {
        double totalBayar;
        totalBayar = 0.0; 
        for (Produk pesanan : daftarPesanan) {
            totalBayar += pesanan.getHarga() * pesanan.getKuantitas();
        }
        return totalBayar;
    }
   
    public void tampilPesanan() {
        logger.info("\n\nPesanan Anda: ");
        for (Produk pesanan : daftarPesanan) {
                pesanan.tampilkanProduk();
        }
        logger.info("Total harga: Rp " + totalBayar());
    }
}