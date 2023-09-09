package com.mycompany.pertemuan3;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();
        
        String[] tokens = input.split("[,!?._ '@]+");
        for (String token : tokens) {
            System.out.println(token);
        }  
    }
}
