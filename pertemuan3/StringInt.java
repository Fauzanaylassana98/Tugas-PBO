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
public class StringInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan kata dan angka: ");

        String[] inputkata = new String[3];
        short[] inputangka = new short[3];

        for (int i = 0; i < 3; i++) {
            inputkata[i] = scanner.next();
            inputangka[i] = scanner.nextShort();
        }
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", inputkata[i], inputangka[i]);
        }
        System.out.println("================================");
        
    }
}
