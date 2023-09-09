/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author user
 */
public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        
        System.out.println(" ");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
