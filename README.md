# 1. Buatlah perulangan hingga 100 menggunakan Java
    for (int i = 1; i <= 100; i++) {
    
kode diatas merupakan loop for yang akan berjalan dari i sama dengan 1 hingga i kurang dari atau sama dengan 100. Dalam loop ini, i bertindak sebagai variable loop yang meningkat satu per satu setiap kali literasi.

    if (i < 10) {
        System.out.println(i);
    } else {
        System.out.println("Aulia Dwi Rahmadani");
    }

kode di atas merupakan blok if-else yang digunakan untuk mencetak nilai ke layar berdasatkan kondisi. Jika i kurang dari 10, maka program akan mencetak nilai i. Jika i 10 atau lebih besar, maka program akan mencetak string "Aulia Dwi Rahmadani"

    1
    2
    3
    4
    5
    6
    7
    8
    9
    Aulia Dwi Rahmadani
    Aulia Dwi Rahmadani
    Aulia Dwi Rahmadani
    ...
    Aulia Dwi Rahmadani (hingga 100)

Jadi Output program akan terlihat seperti di atas

# 2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
    package com.belajarkoding.perulanganwhile;
    import java.util.Scanner;

kode di atas mengatur paket tempat program ini berada dan mengimpor kelas yang digunakan untuk menerima masukan dari pengguna

    public class Perulanganwhile {
kode di atas merupakan deklarasi kelas utama yang bernama "Perulanganwhile"

    public static void main(String[] args) {
kode di atas merupakan metode utama program yang akan dieksekusi saat program dijalankan

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris: ");
    int jumlahBaris = input.nextInt();
Di sini, program membuat objek scanner untuk menerima masukan dari pengguna. Selanjutnya, program mencetak pesan untuk meminta pengguna memasukkan jumlah baris yang diinginkan dan kemudian membeca jumlah baris tersebut

    int baris = 1;
    char karakter = 'A';
kode di atas merupakan inisialisasi variable "baris" yang akan digunakan sebgai perhitungan untuk iterasi melalui baris-baris dalam pol, dan "karakter" yang akan digunakan untuk mencetak karakter dalam pola

    while (baris <= jumlahBaris) {
kode di atas merupakan perulangan utama yang akan mengatur berapa banyak baris yang akan dicetak dalam pola segitiga. Loop ini akan berjalan selama nilai "baris" kurang dari atau sama dengan "jumlahBaris".

    int spasi = jumlahBaris - baris;
    while (spasi > 0) {
        System.out.print(" ");
        spasi--;
    }
Di dalam loop utama, perulangan ini digunakan untuk mencetak spasi sebelum karakter. Jumlah spasi yang dicetak disesuaikan dengan perbedaan antara "jumlahBaris" dan "baris".

    int huruf = 1;
    while (huruf <= baris) {
        System.out.print(karakter);
        karakter++;
        huruf++;
    }
Perulangan ini digunakan untuk mencetak karakter dalam pola. Ini akan mencetak karakter yang dimulai dari A dan akan meningkat setiap kali karakter dicetak untuk membentuk baris yang sesuai.

    karakter = 'A';
    System.out.println();
    baris++;
Setelah mencetak satu baris karakter, variabel karakter dikembalikan ke 'A', dan program menggunakan System.out.println(); untuk pindah ke baris berikutnya. Variabel baris juga ditingkatkan untuk memproses baris berikutnya dalam pola.

## output
    Masukkan jumlah baris: 5
        A
       AB
      ABC
     ABCD
    ABCDE
di atas merupakan hasil output jika pengguna memasukkan jumlah baris 5

# 3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
    package com.belajarkoding.zodiac;
    import java.util.Scanner;
Bagian ini mendefinisikan paket tempat program berada (com.belajarkoding.zodiac) dan mengimpor kelas Scanner yang akan digunakan untuk menerima masukan dari pengguna.

    public class Zodiac {
kode di atas merupakan deklarasi kelas utama yang bernama "Zodiac"

    public static void main(String[] args) {
berikut merupakan metode utama program yang akan dieksekusi saat program dijalankan.

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan tanggal lahir (contoh: 25): ");
    int tanggal = input.nextInt();
    System.out.print("Masukkan bulan lahir (contoh: 7 untuk Juli): ");
    int bulan = input.nextInt();
Program ini menggunakan objek Scanner untuk menerima masukan dari pengguna. Ini mencakup masukan tanggal lahir dan bulan lahir.

    String zodiak = hitungZodiak(tanggal, bulan);
Program memanggil fungsi hitungZodiak dengan argumen tanggal dan bulan yang dimasukkan oleh pengguna. Hasil zodiak yang dihitung akan disimpan dalam variabel zodiak.

    if (zodiak != null) {
        System.out.println("Zodiak Anda adalah: " + zodiak);
    } else {
        System.out.println("Tanggal atau bulan yang Anda masukkan tidak valid.");
    }
Program memeriksa apakah hasil zodiak bukan null. Jika hasilnya valid, program akan mencetak zodiak yang sesuai dengan masukan pengguna. Jika masukan tanggal atau bulan tidak valid, program akan mencetak pesan kesalahan.

    public static String hitungZodiak(int tanggal, int bulan) {
        // ...
    }
kode di atas adalah fungsi yang menghitung zodiak berdasarkan tanggal dan bulan yang dimasukkan. Fungsi ini menggunakan serangkaian pernyataan if-else untuk menentukan zodiak berdasarkan tanggal dan bulan yang dimasukkan.

## output
    Masukkan tanggal lahir (contoh: 25): 25
    Masukkan bulan lahir (contoh: 7 untuk Juli): 7
    Zodiak Anda adalah: Leo
jadi, di atas merupakan hasil output jika pengguna memasukkan tanggal 25 dan bulan 7

# 4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for
    package com.belajarkoding.array;
Ini adalah deklarasi paket (package) di mana program ini berada.

    public class Array {
Ini adalah deklarasi kelas utama yang bernama "Array."

    public static void main(String[] args) {
Ini adalah metode utama program yang akan dieksekusi saat program dijalankan.

    int[] angka = {10, 20, 30, 40, 50};
Di sini, kita mendeklarasikan dan menginisialisasi array angka dengan lima nilai bertipe data int.

    for (int i = 0; i < angka.length; i++) {
        System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);
    }
Dalam loop for, program menggunakan perulangan untuk mengakses dan mencetak semua nilai dalam array. Perulangan ini akan berjalan sebanyak angka.length kali (panjang array). Pada setiap iterasi, program mencetak nilai yang ada dalam array dan nomor urutnya. (i + 1) digunakan untuk mengganti indeks mulai dari 0 menjadi mulai dari 1 saat mencetak.

## output
    Nilai ke-1: 10
    Nilai ke-2: 20
    Nilai ke-3: 30
    Nilai ke-4: 40
    Nilai ke-5: 50
di atas merupakan hasil output yang mencetak nilai-nilai dalam array angka dan menampilkan pesan yang menunjukkan nomor urut setiap nilai dalam array.

