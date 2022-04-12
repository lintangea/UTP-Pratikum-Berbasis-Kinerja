import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int saldoawal, setor;
        saldoawal = input.nextInt();
        setor = input.nextInt();
        System.out.println(hitung(saldoawal,setor));
    }
    public static double hitung (int saldo, int setor){
        double saldosementara = saldo + setor - 7000;
        double bonus = 5 * saldosementara / 100 / 100 ;
        double saldoakhir = saldosementara + bonus;
        return saldoakhir;
    }
}