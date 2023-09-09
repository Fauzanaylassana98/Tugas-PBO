/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penjualan: ");
        int Penjualan = scanner.nextInt();
        
        System.out.println (Penjualan);
        int gaji = 0;
        gaji += 500000;
        gaji += Penjualan*50000*10/100;
        
        if (Penjualan < 15){
            gaji -= ((15-Penjualan)*50000)*15/100;
        } else if (Penjualan >= 80){
            gaji += Penjualan*50000*35/100;
        } else if (Penjualan >= 40){
            gaji += Penjualan*50000*25/100;
        }
        
        System.out.println(gaji);
    }
}
