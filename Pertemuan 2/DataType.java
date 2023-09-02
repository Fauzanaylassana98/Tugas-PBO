package com.mycompany.project3;
import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa kali ingin mencoba? ");
        byte t = scanner.nextByte();
        
        for (byte i = 0; i<t; i++){
            System.out.println(" ");
            System.out.print("Masukkan sebuah angka: ");
            try {
                long n = scanner.nextLong();

                if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE){
                    System.out.println(n + " can be fitted in: ");
                    if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE){
                        if (n <= Short.MAX_VALUE && n >= Long.MIN_VALUE){
                            if(n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE){
                                System.out.println("* byte");
                            }
                            System.out.println("* short");
                        }
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                }
            } catch (Exception n){
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
    }
}
