package ubfood;
import java.util.Scanner;

public class main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama : Lintang Eka Adiastuti");
        System.out.println("NIM  : 215150601111002");
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        
        
        System.out.println("====UB FOOD====");
        System.out.println("1. Tampil Data Merchant");
        System.out.println("2. Tambah Data Merchant");
        System.out.println("3. Cari Data Merchant");
        System.out.println("4. Update Data Merchant");
        System.out.print("Pilih yang anda perlukan : ");
    int menu = input.nextInt();
        switch (menu) {
            case 1:
              DataMerchant.tampilData();
              System.out.println("");
              break;
            case 2 :
                input.nextLine();
                System.out.println("====Tambah Data Merchant UBFood=====");
                System.out.print("Nama Merchant : ");
                String namaMerchant = input.nextLine();
                System.out.print("Nama Produk : ");
                String namaProduk = input.nextLine();
                System.out.print("Harga Makanan : ");
                double hargaMakanan = input.nextDouble();
                DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant(namaMerchant,namaProduk,hargaMakanan));
                DataMerchant.tampilData();
                break;
            case 3 :
                input.nextLine();
                System.out.println("====Cari Data Merchant UBFood====");
                System.out.print("Cari nama merchant : ");
                String cari = input.nextLine();
                DataMerchant.cariMerchant(cari);
                DataMerchant.tampilData();
                break;
            case 4 :
                System.out.println("====Update Data Merchant UBFood====");
                System.out.print("Cari nama merchant : ");
                String cari2 = input.nextLine();
                System.out.println("Nama Merchant baru : ");
                String merchantBaru = input.nextLine();
                System.out.println("Nama produk baru : ");
                String produkBaru = input.nextLine();
                System.out.println("Harga Makanan baru : ");
                double hargaBaru = input.nextDouble();
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(cari2),merchantBaru,produkBaru,hargaBaru);
                break;
            default:
        }        
        }
    }
    
