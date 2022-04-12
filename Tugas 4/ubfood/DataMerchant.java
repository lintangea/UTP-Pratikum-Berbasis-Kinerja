/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class DataMerchant {
    Scanner input = new Scanner(System.in);
    static Merchant[] merch = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp[]=new Merchant[DataMerchant.merch.length+1];
        for (int i = 0; i < DataMerchant.merch.length; i++){
            temp[i]=DataMerchant.merch[i];
        }
        temp[DataMerchant.merch.length]=merchant;
        return temp;
    }

    public static void tampilData(){
        for (Merchant mch1 : merch){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant (String nama){
        for (int i = 0; i < DataMerchant.merch.length; i++){
            if (nama.equalsIgnoreCase(DataMerchant.merch[i].getNamaMerchant())){
                return DataMerchant.merch[i];
            }
        }
        return null;
    }
    
    public static void tampilMerchant(Merchant merchant){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
            System.out.println("Nama Produk     : "+merchant.getNamaProduk());
            System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
    }
    public static void updateMerchant(Merchant cari, String namaBaru, String produkBaru, double hargaBaru){
           
           tampilData();
    }
}
