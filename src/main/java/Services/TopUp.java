package Services;
import java.util.Scanner;

public class TopUp {
    public String namaBank;
    public Integer nominal;
    Scanner sc = new Scanner(System.in);
    int pilihan;
    private String bankPilihan;
    Mandiri man = new Mandiri();
    BCA bca = new BCA();
    BRI bri = new BRI();


    public void getMenu(){
        System.out.println("=====Pilih Bank=====");
        System.out.println("1. Bank Mandiri");
        System.out.println("2. Bank BCA");
        System.out.println("3. Bank BRI");
        System.out.println("====================");
        System.out.print("Pilih bank anda : ");
        pilihan = sc.nextInt();
        if (pilihan == 1){
            namaBank = "Mandiri";
            getNominal("mandiri");
        } else if (pilihan == 2) {
            namaBank = "BCA";
            getNominal("bca");
        } else if (pilihan == 3) {
            namaBank = "BRI";
            getNominal("bri");
        } else {
            System.out.println("Invalid Product");
        }
    }
    public void getNominal(String bank) {
        System.out.println("======Informasi Bank======");
        System.out.print("Nama Bank : ");
        if (bank.equalsIgnoreCase("mandiri")) {
            man.name();
        } else if (bank.equalsIgnoreCase("bca")){
            bca.name();
        } else if (bank.equalsIgnoreCase("bri")){
            bri.name();
        }
        System.out.print("Biaya Admin : ");
        if (bank.equalsIgnoreCase("mandiri")) {
            System.out.println(man.biayaAdmin());
        } else if (bank.equalsIgnoreCase("bri")){
            System.out.println(bri.biayaAdmin());
        } else {
            System.out.println("-");
        }
        System.out.print("Point : " );
        if (bank.equalsIgnoreCase("bri")) {
            System.out.println(bri.point());
        } else {
            System.out.println("-");
        }
        System.out.print("Masukkan nominal top up : ");
        nominal = sc.nextInt();
    }
}
