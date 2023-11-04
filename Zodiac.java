/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.belajarkoding.zodiac;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Zodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir (contoh: 25): ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan bulan lahir (contoh: 7 untuk Juli): ");
        int bulan = input.nextInt();

        String zodiak = hitungZodiak(tanggal, bulan);

        if (zodiak != null) {
            System.out.println("Zodiak Anda adalah: " + zodiak);
        } else {
            System.out.println("Tanggal atau bulan yang Anda masukkan tidak valid.");
        }
    }

    public static String hitungZodiak(int tanggal, int bulan) {
        if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            return "Aries";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            return "Taurus";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            return "Gemini";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            return "Cancer";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            return "Leo";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            return "Virgo";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            return "Libra";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            return "Scorpio";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            return "Sagittarius";
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            return "Capricorn";
        } else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            return "Aquarius";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            return "Pisces";
        }
        return null;
    }
}
    
