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
public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan 4 plat nomor: ");
        String input = scanner.nextLine();
        
        String[] tokens = input.split(" ");
        String hasil = "";
        for (String token : tokens) {
            hasil = hasil.concat(token);
        } 
        
        long angka = Long.parseLong(hasil);
    
        if ((angka-999999)%5 == 0){
            System.out.println("Berhenti");
        } else{
            System.out.println("Jalan");
        }
    }
}
