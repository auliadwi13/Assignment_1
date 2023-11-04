/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.belajarkoding.perulanganwhile;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Perulanganwhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = input.nextInt();

        int baris = 1;
        char karakter = 'A';

        while (baris <= jumlahBaris) {
            int spasi = jumlahBaris - baris;

            // Menambahkan spasi
            while (spasi > 0) {
                System.out.print(" ");
                spasi--;
            }

            int huruf = 1;
            // Menampilkan karakter dalam pola yang unik
            while (huruf <= baris) {
                System.out.print(karakter);
                karakter++;
                huruf++;
            }

            karakter = 'A'; // Kembalikan karakter ke 'A' setelah selesai baris
            System.out.println(); // Pindah ke baris berikutnya
            baris++;
        }
    }
}
   


