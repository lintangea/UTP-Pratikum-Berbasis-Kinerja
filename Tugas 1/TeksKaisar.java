import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String hurufawal = input.nextLine();
        int move = input.nextInt();
        System.out.println(konversi(hurufawal,move));
    }
    public static String konversi(String huruf, int move){
        String enskripsi = "";
        char ruang;
        for(int i = 0; i < huruf.length(); ++i){
        ruang = huruf.charAt(i);
        if(ruang >= 'a' && ruang <= 'z'){
                    ruang = (char)(ruang+move);

                    if(ruang > 'z'){
                        ruang = (char)(ruang - 'z' + 'a' - 1);
                    }
            enskripsi = enskripsi + ruang;
        }
        else if(ruang >= 'A' && ruang <= 'Z'){
            ruang = (char)(ruang + move);
            
            if(ruang > 'Z'){
                ruang = (char)(ruang - 'Z' + 'A' - 1);
            }
            
            enskripsi = enskripsi + ruang;
        }
        else {
          enskripsi = enskripsi + ruang;
        }
        }
        return enskripsi;
    }

}