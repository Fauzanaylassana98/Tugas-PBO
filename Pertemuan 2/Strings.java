/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3;
import java.util.Scanner;

public class Strings {
    static boolean cekLexicographically(String A, String B){
        boolean lexicographically = false;
        boolean sameChar = true;
        
        int minLength = Math.min(A.length(), B.length());
        
        for (int i = 0; i < minLength; i++) {
            char charA = A.charAt(i);
            char charB = B.charAt(i);

            if (charA < charB) { //ketika huruf beda tetapi charB memang tidak sebelum charA
                lexicographically = false;
                sameChar = false;
                break;
            } else if (charA > charB) { //ketika huruf beda dan charB sebelum charA
                lexicographically = true;
                sameChar = false;
                break;
            }
        }
        
        if (sameChar){ //ketika semua huruf sebelum minLength sama maka akan masuk kedalam perkondisian ini
            if (A.length() < B.length()){ //ketika A tidak mempunyai huruf tambahan maka B tidak sebelum A
                lexicographically = false;
            } else if (A.length() > B.length()){ //ketika A mempunyai huruf tambahan maka B sebelum A
                lexicographically = true;
            }
        }
        
        return lexicographically;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan dua buah kata yang dipisahkan dengan enter:");
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        //menampilkan jumlah huruf dari string A ditambah dengan umlah huruf dari string B
        System.out.println(A.length()+B.length());
        
        //mengecek apakah string B lebih dulu dibandind string A
        boolean lexicographically = cekLexicographically(A,B);
        if (lexicographically){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        //menampilkan kedua kata tersebut dengan huruf depan uppercase
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
