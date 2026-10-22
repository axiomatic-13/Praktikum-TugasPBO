/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author rachm
 */
public class MainUtama {
    public static void main(String[] args) {

        // 1. Increment
        System.out.println("1. OPERATOR INCREMENT ");
        Increment inc = new Increment();
        inc.nilai = 5;
        inc.tampilkanIncrement();
        System.out.println();

        // 2. Persegi Panjang
        System.out.println("2. PERSEGI PANJANG ");
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 50;
        pp.lebar = 45;
        System.out.println("Panjang : " + pp.panjang);
        System.out.println("Lebar   : " + pp.lebar);
        System.out.println("Luas    : " + pp.hitungLuas());
        System.out.println();

        // 3. Persamaan Kuadrat
        System.out.println("3. PERSAMAAN KUADRAT ");
        PersamaanKuadrat pk = new PersamaanKuadrat();
        pk.a = 2;
        pk.b = 10;
        pk.c = 5;
        System.out.println("Nilai a : " + pk.a);
        System.out.println("Nilai b : " + pk.b);
        System.out.println("Nilai c : " + pk.c);
        System.out.println("Hasil (b^2 - 4ac) : " + pk.hitungDeterminant());
        System.out.println();

        // 4. Operasi Matematika
        System.out.println("4. OPERASI MATEMATIKA ");
        OperasiMatematika om = new OperasiMatematika();
        om.x = 22;
        om.y = 33;
        System.out.println("Nilai x : " + om.x);
        System.out.println("Nilai y : " + om.y);
        System.out.println("Penjumlahan (x + y) : " + om.hitungPenjumlahan());
        System.out.println("Pengurangan (x - y) : " + om.hitungPengurangan());
        System.out.println("Perkalian   (x * y) : " + om.hitungPerkalian());
        System.out.println("Pembagian   (x / y) : " + om.hitungPembagian());
        System.out.println();

        // 5. Luas Segitiga
        System.out.println("5. LUAS SEGITIGA ");
        Segitiga sgt = new Segitiga();
        sgt.a = 6;
        sgt.b = 8;
        System.out.println("Nilai a : " + sgt.a);
        System.out.println("Nilai b : " + sgt.b);
        System.out.println("Luas    : " + sgt.hitungLuas());
        System.out.println();

        // 6. Pythagoras dan Keliling Segitiga
        System.out.println("6. PYTHAGORAS & KELILING SEGITIGA ");
        SegitigaPythagoras sgt6 = new SegitigaPythagoras();
        sgt6.a = 6;
        sgt6.b = 8;
        System.out.println("Nilai a           : " + sgt6.a);
        System.out.println("Nilai b           : " + sgt6.b);
        System.out.println("Nilai c (miring)  : " + sgt6.hitungC());
        System.out.println("Keliling Segitiga : " + sgt6.hitungKeliling());
        System.out.println();

        // 7. Manipulasi String
        System.out.println("7. MANIPULASI STRING ");
        ManipulasiString ms = new ManipulasiString();
        ms.a = "Saya Belajar Java";
        ms.b = "Saya Belajar Java";
        System.out.println("String a (lowercase) : " + ms.ubahKeLowercase());
        System.out.println("String b (uppercase) : " + ms.ubahKeUppercase());
        System.out.println();

        // 8. Waktu Tempuh Cahaya
        System.out.println("8. WAKTU TEMPUH CAHAYA ");
        WaktuTempuhCahaya wtc = new WaktuTempuhCahaya();
        System.out.println("Waktu tempuh ke Bulan    : " + wtc.hitungWaktuKeBulan() + " detik");
        System.out.println("Waktu tempuh ke Matahari : " + wtc.hitungWaktuKeMatahari() + " detik");
        System.out.println();

        // 9. Konversi Suhu
        System.out.println("9. KONVERSI SUHU ");
        KonversiSuhu ks = new KonversiSuhu();
        ks.c = 10;
        ks.f = 15;
        ks.r = 5;
        System.out.println("a. Celcius (" + ks.c + "C) -> Fahrenheit : " + ks.celciusToFahrenheit() + "F");
        System.out.println("   Fahrenheit (" + ks.f + "F) -> Celcius  : " + ks.fahrenheitToCelcius() + "C");
        System.out.println("b. Celcius (" + ks.c + "C) -> Reamur     : " + ks.celciusToReamur() + "R");
        System.out.println("   Reamur (" + ks.r + "R) -> Celcius     : " + ks.reamurToCelcius() + "C");
        System.out.println("c. Fahrenheit (" + ks.f + "F) -> Reamur  : " + ks.fahrenheitToReamur() + "R");
        System.out.println("   Reamur (" + ks.r + "R) -> Fahrenheit : " + ks.reamurToFahrenheit() + "F");
    }
}
