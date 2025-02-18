package Services;

public class InVoice {
    Mandiri man = new Mandiri();
    BRI bri = new BRI();
    private Integer totalbiaya = 0;

    public void cetakTransaksi(String nama, Integer saldoAwal, Integer nominal, String namaBank) {
        System.out.println("===============================");
        System.out.println("Name : " + nama);
        System.out.println("TRX ID : XXXX");
        System.out.println("Amount : Rp." + nominal);
        System.out.println("Bank Name : " + namaBank);
        System.out.print("Biaya Admin : ");
        if (namaBank.equalsIgnoreCase("Mandiri")){
            System.out.println("Rp." + man.biayaAdmin());
            totalbiaya = man.biayaAdmin();
        } else if (namaBank.equalsIgnoreCase("BRI")) {
            System.out.println("Rp." + bri.biayaAdmin());
            totalbiaya = man.biayaAdmin();
        } else{
            System.out.println("-");
            totalbiaya = 0;
        }
        System.out.println("Total Bayar : Rp." + (totalbiaya + nominal));
        System.out.println("Previous Saldo : Rp." + saldoAwal);
        System.out.println("Saldo : Rp." + (saldoAwal + nominal));
        System.out.print("Point : ");
        if (namaBank.equalsIgnoreCase("BRI")){
            System.out.println(nominal * bri.point());
        } else {
            System.out.println("-");
        }
    }
}
