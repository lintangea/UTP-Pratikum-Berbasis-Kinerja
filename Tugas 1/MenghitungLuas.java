import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        if (pilihan == 1){
            int sisi = input.nextInt();
            System.out.println(persegi(sisi));
        }
        else if (pilihan == 2){
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            System.out.println(segitiga(alas, tinggi));
        }
        else if (pilihan== 3){
            double jari = input.nextDouble();
            if (jari%7 == 0){
                System.out.println(lingkaran(jari));
            }
            else 
             System.out.println(lingkaran2(jari));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(int sisi){
        int hasil = sisi*sisi;
        return hasil;
    }
    public static int segitiga(Double alas, Double tinggi){
        int hasil = (int) (alas*tinggi/2);
        return hasil;
    }
    public static double lingkaran(double jari){
        double hasil = 22 / 7 * jari * jari;
        return hasil;
    }
    public static double lingkaran2(double jari){
        double hasil = 3.14 * jari* jari;
        int result = (int)hasil; 
        return result;
    }
}